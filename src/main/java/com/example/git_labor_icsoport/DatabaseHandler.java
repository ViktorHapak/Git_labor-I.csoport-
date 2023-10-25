package com.example.git_labor_icsoport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler extends Configs {

    public static Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver"); //beállítjuk a Driver-t, melyet használunk

        Connection dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPassword);

        return dbConnection; //ezzel létrehozzuk a MySQL-kapcsolatot
    }

    public void signUpUser(User user) { //felhasználó regisztrációjának back-end-je
        String insert = "INSERT INTO " + Const.USERS_TABLE + "("  +
                Const.USERS_FIRSTNAME + "," + Const.USERS_LASTNAME +  "," +
                Const.USERS_USERNAME+ "," + Const.USERS_PASSWORD + "," +
                Const.USERS_LOCATION + "," + Const.USERS_GENDER + ")" +
                "VALUES(?,?,?,?,?,?)";



        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1,user.getFirstName());
            prSt.setString(2,user.getLastName());
            prSt.setString(3,user.getUserName());
            prSt.setString(4,user.getPassword());
            prSt.setString(5,user.getLocation());
            prSt.setString(6,user.getGender());

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
} //Ebben az osztályban csatlakozunk az adatbázishoz

package com.example.git_labor_icsoport;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class SignupController {

    private String r2 = "hello-view.fxml";
    private ChangeWindow changeWindow = new ChangeWindow();

    @FXML
    private TextField signupLogin;

    @FXML
    private PasswordField signupPassword;

    @FXML
    private Button signupButton;

    @FXML
    private TextField signupLastname;

    @FXML
    private TextField signupName;

    @FXML
    private TextField signupLocation;

    @FXML
    private CheckBox signupCheckboxMale;

    @FXML
    private Label comment;

    @FXML
    private CheckBox signupCheckboxFemale;

    @FXML
    private Label itprogerLabel;

    @FXML
    void initialize() {
        signupButton.setOnAction(event -> {
            signUpNewUser();
        });
    }

    private void signUpNewUser() { //új felhasználó hozzáadása
        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstName = signupName.getText().trim();
        String lastName = signupLastname.getText().trim();
        String userName = signupLogin.getText().trim();
        String password = signupPassword.getText().trim();
        String location = signupLocation.getText();
        String gender = "";
        if (signupCheckboxMale.isSelected()) gender ="Male";
        else gender = "Female";

        if (firstName.equals("") || lastName.equals("") || userName.equals("")
                || password.equals("") || location.equals("")) {
            comment.setText("Hiányos regisztráció!");
        }  else {

            User user = new User(firstName, lastName, userName, password, location, gender);

            dbHandler.signUpUser(user);
            changeWindow.change(signupButton, r2); //oldal visszaváltás
        }
    }

}

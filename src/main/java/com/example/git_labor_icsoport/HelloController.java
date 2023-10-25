package com.example.git_labor_icsoport;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.example.git_labor_icsoport.ChangeWindow;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class HelloController {

    private String r = "signUp.fxml"; //útvonalfájl-String
    private ChangeWindow changeWindow = new ChangeWindow();

    //fxml objektumok:
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField LoginField;

    @FXML
    private Label AuthorizationLabel;

    @FXML
    private PasswordField PasswordField;

    @FXML
    private Button SigninButton;

    @FXML
    private Label itprogerLabel;

    @FXML
    private Button SignupButton;

    @FXML
    private Label message;

    //metódusok:
    @FXML
    void initialize() {

        SigninButton.setOnAction(event -> {

        });


        SignupButton.setOnAction(event -> {
            System.out.println("Clicked");

            changeWindow.change(SigninButton,r);


        });

    }


}
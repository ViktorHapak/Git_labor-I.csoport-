package com.example.git_labor_icsoport;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ChangeWindow {

    public ChangeWindow() {

    }

    public void change(Button button, String r) {
        button.getScene().getWindow().hide(); //Ablak elrejtése

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(r));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot(); //útvonal a betöltendő fájlhoz
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.showAndWait(); //megmutatja és megvárja, amíg ez az ablak megjelenik

    }
}

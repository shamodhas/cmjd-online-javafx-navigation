package com.ijse.navigation.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.com
 * --------------------------------------------
 * Created: 6/28/2025 9:47 AM
 * Project: navigation
 * --------------------------------------------
 **/

public class OnePageController {
    public AnchorPane ancPageOne;

    public void goPageTwoOnAction(ActionEvent actionEvent) throws IOException {
//        inside window navigation
//        ancPageOne.getChildren().clear();
//
//        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/PageTwo.fxml"));
//        ancPageOne.getChildren().add(anchorPane);

//        another way
//        window navigation
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/PageTwo.fxml"));

        Stage stage = new Stage();
        Scene scene = new Scene(anchorPane);
        stage.setTitle("Page two");
        stage.setScene(scene);
        stage.show();

//        close prev window
        Stage prevStage = (Stage) ancPageOne.getScene().getWindow();
        prevStage.close();
    }
}

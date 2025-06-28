package com.ijse.navigation.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

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
        ancPageOne.getChildren().clear();

        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/PageTwo.fxml"));
        ancPageOne.getChildren().add(anchorPane);
    }
}

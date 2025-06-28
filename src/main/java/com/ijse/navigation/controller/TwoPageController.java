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
 * Created: 6/28/2025 9:48 AM
 * Project: navigation
 * --------------------------------------------
 **/

public class TwoPageController {
    public AnchorPane ancPageTwo;

    public void goPageTwoOnAction(ActionEvent actionEvent) throws IOException {
        ancPageTwo.getChildren().clear();

        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/view/PageOne.fxml"));
        ancPageTwo.getChildren().add(anchorPane);
    }
}

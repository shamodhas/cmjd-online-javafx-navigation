package com.ijse.navigation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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

public class AppInitializer extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent load = FXMLLoader.load(getClass().getResource("/view/PageOne.fxml"));
        Scene scene = new Scene(load);

        stage.setScene(scene);
        stage.setTitle("Navigation");
        stage.show();
    }
}

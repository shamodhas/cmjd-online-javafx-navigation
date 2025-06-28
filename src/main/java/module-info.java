module com.ijse.navigation {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ijse.navigation.controller to javafx.fxml;
//    opens com.ijse.navigation to javafx.fxml;
    exports com.ijse.navigation;
}
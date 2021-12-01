module com.example.registerproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.registerproject to javafx.fxml;
    exports com.example.registerproject;
}
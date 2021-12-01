package com.example.registerproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class RegisterApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException{
        primaryStage.setTitle("User Registrar");
        FXMLLoader registerFXML = new FXMLLoader(RegisterApplication.class.getResource("RegisterGUI.fxml"));
        Scene scene = new Scene(registerFXML.load(), 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
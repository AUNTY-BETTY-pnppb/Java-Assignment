package com.example.registerproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class RegisterController {
    public TextField emailField = new TextField();
    public PasswordField passwordField = new PasswordField();
    public Button registerButton = new Button("Register");
    public Label responseLabel;

    public void register() {
        UserRegistrar newUser = new UserRegistrar(emailField.getText(), passwordField.getText());
        
        if (!newUser.isAnEmail()) {
            responseLabel.setTextFill(Color.FIREBRICK);
            responseLabel.setText("Email is invalid");
        }
    }
}

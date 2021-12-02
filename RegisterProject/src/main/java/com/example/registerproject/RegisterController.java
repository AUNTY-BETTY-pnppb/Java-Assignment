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
        else if (!newUser.isValidLength()) {
            responseLabel.setTextFill(Color.FIREBRICK);
            responseLabel.setText("Password has to be minimum 7 characters");
        }
        else if (!newUser.hasLetter()) {
            responseLabel.setTextFill(Color.FIREBRICK);
            responseLabel.setText("Letters must be included in password");
        }
        else if (!newUser.hasDigit()) {
            responseLabel.setTextFill(Color.FIREBRICK);
            responseLabel.setText("Numbers must be included in password");
        }
        else if (!newUser.hasSymbol()) {
            responseLabel.setTextFill(Color.FIREBRICK);
            responseLabel.setText("Password must include symbols from: *^&@!");
        }
        else {
            responseLabel.setTextFill(Color.MEDIUMSPRINGGREEN);
            responseLabel.setText("You have been registered");
        }
    }
}

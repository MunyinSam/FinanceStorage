package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField nameField;   // matches fx:id="nameField"

    @FXML
    private Label greetingLabel;   // matches fx:id="greetingLabel"

    @FXML
    private void handleGreet() {   // matches onAction="#handleGreet"
        String name = nameField.getText();
        greetingLabel.setText("Hello, " + name + "!");
    }
}
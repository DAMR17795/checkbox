package com.example.checkbox;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CheckBoxController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
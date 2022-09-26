package com.example.checkbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Ventana o Escenario
        StackPane root = new StackPane();

        //Escena
        Scene scene = new Scene(root, 300, 200);

        //Titulo
        stage.setTitle("Checkbox");

        //Checkbox
        //Checkbox without a caption
        CheckBox cb1 = new CheckBox();
        //ChecBox with a string caption
        CheckBox cb2 = new CheckBox("Second");

        cb1.setText("First");
        cb1.setSelected(true);

        root.getChildren().addAll(cb1, cb2);
        cb1.setAlignment(Pos.CENTER);
        cb2.setAlignment(Pos.TOP_RIGHT);

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
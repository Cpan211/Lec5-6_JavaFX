/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec6.BorderPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Christin_Humber
 */
public class BorderPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(10));

        // Top (Radio Buttons)
        ToggleGroup radioGroup = new ToggleGroup();
        RadioButton radioBtn1 = new RadioButton("Option 1");
        RadioButton radioBtn2 = new RadioButton("Option 2");
        radioBtn1.setToggleGroup(radioGroup);
        radioBtn2.setToggleGroup(radioGroup);

        VBox radioBox = new VBox(new Label("Radio Buttons"), radioBtn1, radioBtn2);
        radioBox.setPadding(new Insets(10));
        radioBox.setAlignment(Pos.CENTER);
        borderPane.setTop(radioBox);

        // Left (Checkboxes)
        CheckBox checkBox1 = new CheckBox("Checkbox 1");
        CheckBox checkBox2 = new CheckBox("Checkbox 2");

        VBox checkBoxBox = new VBox(5, new Label("Checkboxes"), checkBox1, checkBox2);
        checkBoxBox.setPadding(new Insets(10));
        checkBoxBox.setAlignment(Pos.CENTER);
        borderPane.setLeft(checkBoxBox);

        // Right (TextFields)
        TextField textField = new TextField();
        VBox textFieldBox = new VBox(new Label("Text Field"),textField);
        textFieldBox.setAlignment(Pos.CENTER);
        textFieldBox.setPadding(new Insets(5));
        borderPane.setRight(textFieldBox);

        // Center (TextArea)
        TextArea textArea = new TextArea();
        textArea.setPrefRowCount(5);
        VBox textAreaBox = new VBox(new Label("Text Area"), textArea);
        textAreaBox.setAlignment(Pos.CENTER);
        borderPane.setCenter(textAreaBox);

        // Bottom (ComboBox)
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Option A", "Option B", "Option C");
        comboBox.setValue("Option A");

        VBox comboBoxBox = new VBox(new Label("Combo Box"), comboBox);
        comboBoxBox.setAlignment(Pos.CENTER);
        comboBoxBox.setPadding(new Insets(5));
        borderPane.setBottom(comboBoxBox);

        Scene scene = new Scene(borderPane, 800, 600);
        primaryStage.setTitle("BorderPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

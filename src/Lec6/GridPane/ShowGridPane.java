/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec6.GridPane;

/**
 *
 * @author Christin_Humber
 *
 * code from
 * https://liveexample.pearsoncmg.com/liang/intro12e/html/ShowGridPane.html
 */
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER); // Set center alignment
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5); // Set vGap to 5.5px

        Label lblFirstName = new Label("First Name:");
        TextField tfFirstName = new TextField();
        pane.add(lblFirstName, 0, 0);
        pane.add(tfFirstName, 1, 0);

        Label lblMI = new Label("Student ID:");
        TextField tfMI = new TextField();
        pane.add(lblMI, 0, 1);
        pane.add(tfMI, 1, 1);

        Label lblLastName = new Label("Last Name:");
        TextField tfLastName = new TextField();
        pane.add(lblLastName, 0, 2);
        pane.add(tfLastName, 1, 2);

        Button btAdd = new Button("Add Name");
        pane.add(btAdd, 1, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);

        // Add event handler to the button
        btAdd.setOnAction(e -> {
            // Get the text from the text fields
            String firstName = tfFirstName.getText();
            // Print the name to the console
            System.out.println("Name: " + firstName);
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowGridPane"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited JavaFX support.
     * Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}

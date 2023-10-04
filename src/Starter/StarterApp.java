/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package Starter;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Christin_Humber
 */
public class StarterApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane pane = new Pane();
        Label label = new Label("Hello World");
        
        Button button = new Button();
        
        button.setText("This is My Button");
        label.setAlignment(Pos.CENTER);
        
        button.setAlignment(Pos.CENTER);
        
        button.layoutXProperty().bind(pane.widthProperty().divide(2));

        pane.getChildren().add(label);
        pane.getChildren().add(button);
        
        
        
        Scene scene = new Scene(pane,300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

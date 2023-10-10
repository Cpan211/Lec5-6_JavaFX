/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package Lec5.EventHandler.InnerClass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Christin_Humber
 */
public class ButtonClick extends Application {
    
    
    private  Button btn;
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {

            // Create a layout and add the button to it
        Pane pane = new Pane();
        primaryStage.setTitle("Button Click Example");

        // Create a button
        btn = new Button("Click me!");

//         Create an instance of the EventHandler inner class
         ButtonClickHandler handler = new ButtonClickHandler();

        // Set the handler for the button click event
        btn.setOnAction(handler);
        
        
        btn.layoutXProperty().bind(pane.widthProperty().subtract(btn.widthProperty()).divide(2));
        btn.layoutYProperty().bind(pane.heightProperty().subtract(btn.heightProperty()).divide(2));

        pane.getChildren().add(btn);

        // Create a scene and set it on the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
        
    }


    private class ButtonClickHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
            
            if(t.getSource() == btn)
                System.out.println("This button is clickable");

        }
    }
    
}

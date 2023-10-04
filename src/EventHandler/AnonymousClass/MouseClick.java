/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package EventHandler.AnonymousClass;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Christin_Humber
 */
public class MouseClick extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Create a pane to hold the circle 
        Pane pane = new Pane();

        // Create a circle and set its properties
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.BEIGE);
        
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>(){
            
        @Override
        public void handle(MouseEvent t) {
                
            if(circle.getFill() == Color.BEIGE){
                circle.setFill(Color.BLUE);
            }else{
                circle.setFill(Color.BEIGE);
            }

        }
            
        };
        
        circle.setOnMouseClicked(eventHandler);
        
        pane.getChildren().add(circle); // Add circle to the pane

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("ShowCircleCentered"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

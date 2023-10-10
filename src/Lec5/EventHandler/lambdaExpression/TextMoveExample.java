/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package Lec5.EventHandler.lambdaExpression;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Christin_Humber
 */
public class TextMoveExample extends Application {
    
    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        Text text = new Text(20, 20, "A");

        pane.getChildren().add(text);

        text.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN:
                    text.setY(text.getY() + 10);
                    break;
                case UP:
                    text.setY(text.getY() - 10);
                    break;
                case LEFT:
                    text.setX(text.getX() - 10);
                    break;
                case RIGHT:
                    text.setX(text.getX() + 10);
                    break;
                default:
                    if (e.getText().length() > 0)
                        text.setText(e.getText());
            }
        });

        // Create a scene and set it on the stage
        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);

        // Set the focus on the scene so that it can receive key events
        scene.setOnKeyPressed(e -> text.requestFocus());

        // Set the stage title and show it
        stage.setTitle("Text Move Example");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    private void drawLine(){
    }
}

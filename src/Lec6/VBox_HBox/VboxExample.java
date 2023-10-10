/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec6.VBox_HBox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Christin_Humber
 */
public class VboxExample extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        VBox box = new VBox(10,btn1, btn2, btn3);
        
        Scene scene = new Scene(box, 250, 400);
        stage.setTitle("VBox Example");
        stage.setScene(scene);
        stage.show();
        
    }
    
    
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
    
    
    
    
}

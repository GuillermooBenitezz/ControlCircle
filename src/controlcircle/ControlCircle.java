/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package controlcircle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


/**
 *
 * @author usu2dam
 */
public class ControlCircle extends Application 
{
    
    private Circle circle = new Circle();
    
    
    @Override
    public void start(Stage primaryStage) {
        
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btn = new Button("Enlarge");
        Button btn2 = new Button("Shrink");
        hBox.getChildren().add(btn);
        hBox.getChildren().add(btn2);
       

        btn.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent e) 
            {
                circle.setRadius(circle.getRadius() + 2);
            }
        });
        
        btn2.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent e) 
            {
                circle.setRadius(circle.getRadius() > 2
                ? circle.getRadius() - 2 : circle.getRadius());
            }
        });
        
        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);
        
        // Creando un círculo y activando sus propiedades
        circle.centerXProperty().bind(borderPane.widthProperty().divide(2));
        circle.centerYProperty().bind(borderPane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        
        borderPane.setCenter(circle);
        
        Scene scene = new Scene(borderPane, 300, 250);
        
        primaryStage.setTitle("Control Circle (Guillermo)");
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




        


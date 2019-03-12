package com.soft1841.gui.com;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import javax.swing.*;

import static javafx.application.Application.launch;

public class soft1841 {
        private JInternalFrame stage;
}@Override
public void start(Stringage primaryStage) throws Exception {
        //Creating a line object 
        Line line = new Line();

        //Setting the properties to a line 
        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(500.0);
        line.setEndY(150.0);

        //Creating a Group 
        Group root = new Group(line);

        //Creating a Scene 
        Scene scene = new Scene(root, 600, 300);

        //Setting title to the scene 
        stage.setTitle("Sample application");

        //Adding the scene to the stage 
        stage.setScene(scene);

        //Displaying the contents of a scene 
        stage.show();
}
        public static void main(String args[]){
                launch(args);
        }
        }
}

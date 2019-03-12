package com.soft1841.oop.week1.sample1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class App extends Application {
    @Override
    public void start (Stage primaryStage) throws Exception {
        URL location=getClass().getResource("/fxml/main.fxml");
        FXMLLoader fxmlLoader=new FXMLLoader(location);
        Parent root=fxmlLoader.load();
        Scene scene=new Scene(root,800,600);
        scene.getStylesheets().addAll(
                "/css/style.css");
        primaryStage.setTitle("首页");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main (String[] args) {
        Application.launch(args);
    }
}

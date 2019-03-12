package com.soft1841.domo1;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ArrayApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //读入外部fxml布局文件
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("数组的GUI界面");
        //创建场景
        Scene scene = new Scene(root,1000,600);
        primaryStage.setScene(scene );
        primaryStage.show() ;

    }

    public static void main(String[] args) {
        launch(args);

    }
}

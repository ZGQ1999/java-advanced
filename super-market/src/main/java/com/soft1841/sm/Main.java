package com.soft1841.sm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
// 创建场景
        Scene scene = new Scene(root, 600,400);
// 显示图片组件
        ImageView imgView = new ImageView(this.getClass().getResource("/img/1.jpg").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("超市收银系统");
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}

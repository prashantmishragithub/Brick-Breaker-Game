package com.example.brick_breaker_game;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

     static Stage globalstage;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("start_page.code.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        globalstage = stage;
        stage.setTitle("welcome");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void onstartbuttonclick() throws IOException {

        // open the game screen
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game_screen.code.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        globalstage.setScene(scene);
        globalstage.setTitle("welcome to the game screen");
        globalstage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}

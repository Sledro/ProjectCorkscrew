package io.ironbytes.corkscrew.models;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenu extends Application {
    Parent root;
    Stage stage;

    @Override
    public void start(Stage primaryStage) {

        try {
            root = FXMLLoader.load(getClass().getResource("../views/MainMenu.fxml"));
            stage = primaryStage;
            stage.setTitle("Welcome");
     
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    public static void main(String[] args) {
    		launch(args);
    }   
}
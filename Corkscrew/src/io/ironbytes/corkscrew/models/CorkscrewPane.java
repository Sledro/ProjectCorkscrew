package io.ironbytes.corkscrew.models;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class CorkscrewPane extends AnchorPane{

    public CorkscrewPane(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../views/CorkscrewPane.fxml"));

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

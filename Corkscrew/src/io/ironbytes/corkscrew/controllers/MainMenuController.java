package io.ironbytes.corkscrew.controllers;



import io.ironbytes.corkscrew.models.*;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;


public class MainMenuController  {
	
	    @FXML
	    BorderPane mainPane;

	    @FXML
	    public void onBtnAClick(){
	        ConnectionsPane contentA = new ConnectionsPane();
	        mainPane.setCenter(contentA);
	    }

	    @FXML
	    public void onBtnBClick(){
	    	ConnectionsPane contentB = new ConnectionsPane();
	        mainPane.setCenter(contentB);
	    }

	    @FXML
	    public void onBtnCClick(){
	    	CorkscrewPane contentC = new CorkscrewPane();
	        mainPane.setCenter(contentC);
	    }
	
}
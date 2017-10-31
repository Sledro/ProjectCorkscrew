package io.ironbytes.corkscrew.models;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class ConnectionsPane extends AnchorPane{
	
    /**
     * The data as an observable list of Persons.
     */
    public ObservableList<Client> clientData = FXCollections.observableArrayList();
    

    public ConnectionsPane(){
    	
        //Add a test client to the ObservableList
        clientData.add(new Client(1));
        
        System.out.println(getClientData());
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../views/ConnectionsPane.fxml"));
        
        //Give the controller access to the main app.
        //ConnectionsPaneController controller = fxmlLoader.getController();
        //controller.setMainApp(this);
        
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ObservableList<Client> getClientData() {
        return clientData;
    
    }

}
package io.ironbytes.corkscrew.controllers;

import io.ironbytes.corkscrew.models.Client;
import io.ironbytes.corkscrew.models.ConnectionsPane;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ConnectionsPaneController {

	@FXML private TableView<Client> clientDataTable;
	@FXML private TableColumn<Client, String> online;
	@FXML private TableColumn<Client, String> username;
	private ConnectionsPane ConnectionsPane;

	public ConnectionsPaneController() {
		
	}
	
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
       username.setCellValueFactory(cellData -> cellData.getValue().getUsername());

    }
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(ConnectionsPane ConnectionsPane) {
        this.ConnectionsPane = ConnectionsPane;

     // Prints: [Client [clientID=1, isOnline=true, username=StringProperty [value: test], ipAddress=1.1.1.1]]
        System.out.println(ConnectionsPane.getClientData());
     // Add observable list data to the table
        clientDataTable.setItems(ConnectionsPane.getClientData());
        clientDataTable.refresh();
       
    }
	
}

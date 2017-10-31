package io.ironbytes.corkscrew.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Client {
	
	private int clientID;
	private boolean isOnline;
	private StringProperty username;
	private String ipAddress;
	
	public Client() {

	}
	
	public Client(int ClientID) {
		this.clientID=ClientID;
		this.isOnline=true;
		this.ipAddress="1.1.1.1";
		this.username = new SimpleStringProperty("test");
	}

	@Override
	public String toString() {
		return "Client [clientID=" + clientID + ", isOnline=" + isOnline + ", username=" + username + ", ipAddress="
				+ ipAddress + "]";
	}

	public int getClientID() {
		return clientID;
	}
	
	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public boolean isOnline() {
		return isOnline;
	}

	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}

	public StringProperty getUsername() {
		return username;
	}

	public void setUsername(StringProperty username) {
		this.username = username;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}


}

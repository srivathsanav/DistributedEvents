package com.distributedevents.eventing;

public enum EventConstants {
	
	RECEIVED_EVENT ("Received Event With ");
	
	private String message; 
	
	private EventConstants(final String message) {
		this.message = message;
	}
	
}

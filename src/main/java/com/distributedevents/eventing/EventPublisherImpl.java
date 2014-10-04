package com.distributedevents.eventing;

public class EventPublisherImpl implements EventPublisher {

	public void publish(Event e) {
		EventProcessor.processEvent(e);
	}

}

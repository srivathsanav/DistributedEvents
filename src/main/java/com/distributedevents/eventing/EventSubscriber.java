package com.distributedevents.eventing;

public interface EventSubscriber {

	public void subscribe(final EventType e);
	
	public void processEvent(final Event e);
}

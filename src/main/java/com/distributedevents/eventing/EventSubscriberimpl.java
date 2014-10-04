package com.distributedevents.eventing;

public class EventSubscriberimpl implements EventSubscriber {

	public void subscribe(EventType e) {
		EventRegistry.getRegistry().register(e, this);
	}

	public void processEvent(final Event e) {
		final String message = new StringBuilder(EventConstants.RECEIVED_EVENT.toString()).append(e.getEventType())
				.append(e).toString();
		AsynchronousInMemoryStorer.INSTANCE.addMessage(message);
	}

}

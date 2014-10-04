package com.distributedevents.eventing;

import java.util.List;

public class EventProcessor  {

	public static void processEvent(Event e) {
		List<EventSubscriber> eventSubscribers = EventRegistry.getRegistry().getEventSubscribers(e.getEventType());
		if (eventSubscribers != null) {
			for (EventSubscriber es : eventSubscribers) {
				es.processEvent(e);
			}
		}
	}

}

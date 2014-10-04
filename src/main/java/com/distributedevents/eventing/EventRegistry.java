package com.distributedevents.eventing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EventRegistry {
	
	private final static EventRegistry eventRegistry = new EventRegistry();
	
	private final Map<EventType, List<EventSubscriber>> registry = new ConcurrentHashMap<EventType, List<EventSubscriber>>();
	
	private EventRegistry () {
		
	}
	
	public static EventRegistry getRegistry() {
		return eventRegistry;
	}
	
	public void register (final EventType eventType, final EventSubscriber eventSubscriber) {
		 List<EventSubscriber> eventSubsribers = new ArrayList<EventSubscriber>();
	     if (registry.containsKey(eventType)) { 
	    	 eventSubsribers = registry.get(eventType);
	     } 
    	 eventSubsribers.add(eventSubscriber);
    	 registry.put(eventType, eventSubsribers);
	}
	
	public List<EventSubscriber> getEventSubscribers(final EventType e) {
		return registry.get(e);
	}
}

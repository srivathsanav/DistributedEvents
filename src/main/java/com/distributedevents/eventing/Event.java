package com.distributedevents.eventing;

public class Event {

	private EventType eventType;

	private Object eventObj;


	public EventType getEventType() {
		return eventType;
	}


	public Event(EventType eventType, Object eventObj) {
		super();
		this.eventType = eventType;
		this.eventObj = eventObj;
	}

	public Object getEventObj() {
		return eventObj;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((eventObj == null) ? 0 : eventObj.hashCode());
		result = prime * result
				+ ((eventType == null) ? 0 : eventType.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Event [eventType=" + eventType + ", eventObj=" + eventObj + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (eventObj == null) {
			if (other.eventObj != null)
				return false;
		} else if (!eventObj.equals(other.eventObj))
			return false;
		if (eventType != other.eventType)
			return false;
		return true;
	}

}

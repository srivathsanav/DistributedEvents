package com.distributedevents.eventing;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Unit test for DistributedEvents App.
 */
public class DistributedEventTest extends TestCase {

	@Test
	public void testEvents() {
		// Subscribe Event Type A for Subscriber 1
		final EventSubscriber eventSubscriber1 = new EventSubscriberimpl();
		eventSubscriber1.subscribe(EventType.TYPE_A);

		// Subscribe Event Type A , B for Subscriber 2
		final EventSubscriber eventSubscriber2 = new EventSubscriberimpl();
		eventSubscriber2.subscribe(EventType.TYPE_A);
		eventSubscriber2.subscribe(EventType.TYPE_B);

		// Publish message for TYPE_N
		final EventPublisher eventPublisher = new EventPublisherImpl();
		eventPublisher.publish(new Event(EventType.TYPE_N, "Nice App"));
		
		// Test processed Messages
		assertEquals(0, AsynchronousInMemoryStorer.INSTANCE.getMessages().size());
		
		// Publish message for TYPE_A
		eventPublisher.publish(new Event(EventType.TYPE_A, "Nice App"));
		assertEquals(2, AsynchronousInMemoryStorer.INSTANCE.getMessages().size());
		
	}

}

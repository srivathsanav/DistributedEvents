package com.distributedevents.eventing;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public  class AsynchronousInMemoryStorer {
	
	private  Queue<String> processedMessages = new ConcurrentLinkedQueue<String>();
	
	public static AsynchronousInMemoryStorer INSTANCE = new AsynchronousInMemoryStorer();
	
	private AsynchronousInMemoryStorer () {
		
	}

	public  void addMessage(String message) {
		processedMessages.add(message);
	}
	
	public Queue<String> getMessages() {
		return processedMessages;
	}
}

package com.shitouer.thread;

import org.junit.Test;

public class RunnableThreadTest {
	@Test
	public void testRunnableThread() {
		Thread thread1 = new Thread(new RunnableThread(), "thread1");
		Thread thread2 = new Thread(new RunnableThread(), "thread2");
		RunnableThread thread3 = new RunnableThread("thread3");
		// Start the threads
		thread1.start();
		thread2.start();
		try {
			// delay for one second
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
		}
		// Display info about the main thread
		System.out.println(Thread.currentThread());
	}
}

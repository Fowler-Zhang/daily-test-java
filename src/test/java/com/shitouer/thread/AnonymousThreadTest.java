package com.shitouer.thread;

import org.junit.Test;

public class AnonymousThreadTest {
	@Test
	public void testAnonymousThread() {
		(new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("inner");
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();

		for (int i = 0; i < 10; i++) {
			System.out.println("outter");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

package com.shitouer.thread;

public class XThread extends Thread {

	public XThread() {
		super();
	}

	public XThread(String threadName) {
		super(threadName);
		start();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

package com.shitouer.thread;

public class RunnableThread implements Runnable {

	Thread runner;

	public RunnableThread() {

	}

	public RunnableThread(String threadName) {
		System.out.println("I am " + threadName);
		runner = new Thread(this, threadName);
		runner.start();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	}

}

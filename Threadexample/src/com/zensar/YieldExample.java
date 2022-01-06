package com.zensar;

public class YieldExample extends Thread {

	public static void main(String[] args) {
		
		YieldExample yieldExample=new YieldExample();
		yieldExample.start();

		for (int i = 0; i < 10; i++) {

			System.out.println("Parent thread");
		}

	}

	@Override
	public void run() {
		super.run();
		
		for (int i = 0; i < 10; i++) {

			System.out.println("child thread");
			//Thread.yield();
		}
	}

}

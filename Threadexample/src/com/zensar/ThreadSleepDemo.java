package com.zensar;

public class ThreadSleepDemo extends Thread{
	
	public static void main(String[] args) {
		
		ThreadSleepDemo demo=new ThreadSleepDemo();
		demo.start();
		demo.interrupt();
		System.out.println("Msin thread finished");
		
	}
	
	@Override
	public void run() {
		super.run();
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("Child thraed");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("child thread interrupted");
			}
		}
	}
	
	

}

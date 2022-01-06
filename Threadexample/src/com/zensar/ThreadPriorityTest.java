package com.zensar;

public class ThreadPriorityTest {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
		
		
		Thread.currentThread().setPriority(7);
		
		Thread t1=new Thread();
		t1.start();
		
		System.out.println(t1.getName()+":"+t1.getPriority());
		
	}

}

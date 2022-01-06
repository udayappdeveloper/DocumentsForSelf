package com.zensar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadsTest2 extends Thread {
	public static void main(String[] args) {
		
		ThreadsTest2  t=new ThreadsTest2();
		t.setPriority(9);
		t.start();

		for (int i = 0; i < 10; i++) {

			System.out.println("main Thread");
		}

	}

	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Child thread");
		}

	}
}

package com.zensar;

public class MethodReferanceExample {

	public static void main(String[] args) {

		// it is for Static Method Reference

		Runnable r = MethodReferanceExample::m1;
		new Thread(r).start();

		// it is for Method Reference

		//MethodReferanceExample ex = new MethodReferanceExample();
		Runnable r1 = new MethodReferanceExample()::m2;
		new Thread(r1).start();

	}

	public static void m1() {

		for (int i = 0; i < 10; i++) {

			System.out.println(i);
		}
	}

	public void m2() {

		for (int i = 0; i < 10; i++) {

			System.out.println(i);
		}

	}

}

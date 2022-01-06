package com.zensar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadsTest {
	public static void main(String[] args) throws InterruptedException {
		ProducerAndConsumer pc = new ProducerAndConsumer();
		Thread t1 = new Thread(() -> {

			try {
				pc.produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread t2 = new Thread(() -> {
			try {
				pc.consume();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		});
		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

	public static class ProducerAndConsumer {

		List<Integer> list = new ArrayList<>();
		int capacity = 3;

		public void produce() throws InterruptedException {
			while (true) {
				synchronized (this) {

					while (list.size() == capacity)
						wait();
					Random rand = new Random();

					// Generate random integers in range 0 to 999
					int randNumber = rand.nextInt(1000);

					System.out.println("Producer produced-" + randNumber);

					list.add(randNumber);

					notify();

					Thread.sleep(1000);
				}
			}
		}

		public void consume() throws InterruptedException {
			while (true) {
				synchronized (this) {

					while (list.size() == 0)
						wait();
					int val = list.remove(0);

					System.out.println("Consumer consumed-" + val);

					notify();

					Thread.sleep(1000);
				}
			}
		}
	}
}

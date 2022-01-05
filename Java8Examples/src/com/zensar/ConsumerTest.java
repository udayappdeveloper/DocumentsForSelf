package com.zensar;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerTest {

	public static void main(String[] args) {
		sampleConsumer();

	}

	public static void sampleConsumer() {
		System.out.println("************Sample consumer1********");

		Consumer<String> con = s -> System.out.println(s);
		con.accept("uday");
	}



}

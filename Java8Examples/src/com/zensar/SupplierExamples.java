package com.zensar;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExamples {

	public static void main(String[] args) {

		supplerSample();

	}

	public static void supplerSample() {
		System.out.println("***************Sample consumer2*********");

		Supplier<String> supplier = () -> {

			String otp = "";

			for (int i = 0; i < 5; i++) {
				int randonNumber = new Random().nextInt(9);

				otp = otp + randonNumber;
			}

			return otp;

		};

		System.out.println(supplier.get());
	}

}

package com.zensar;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class IntPredicateExample {

	public static void main(String[] args) {

		IntPredicate intPredicate = i -> i > 5;
		System.out.println(intPredicate.test(3));

		IntFunction<Integer> val = i -> i * 2;
		System.out.println(val.apply(5));

		IntConsumer consumer = a -> System.out.println(a);

		consumer.accept(5);
		
				
		IntSupplier sup=()->{
			
			return 10;
		};
		System.out.println(sup.getAsInt());

	}

}

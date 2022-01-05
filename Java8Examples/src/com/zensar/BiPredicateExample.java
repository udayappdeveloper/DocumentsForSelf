package com.zensar;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	
	public static void main(String[] args) {
		byPredicateExample();
		
	}
	
	public static void byPredicateExample() {
		
		BiPredicate<Integer,Integer> biPredicate=(a,b)->a>b;
		
		System.out.println(biPredicate.test(2, 5));
	}

}

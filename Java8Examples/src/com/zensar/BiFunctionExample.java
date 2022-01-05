package com.zensar;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {
	
	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		BiFunction<Integer, String, Employee> biFunction=(eno,eName)->new Employee(eno, eName);
		
		list.add(biFunction.apply(1, "uday"));
		list.add(biFunction.apply(2, "kalluri"));
		list.add(biFunction.apply(3, "saketh"));
		list.add(biFunction.apply(2, "krishna"));
		
		list.forEach(System.out::println);
		
		
	}

}

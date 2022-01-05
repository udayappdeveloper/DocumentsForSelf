package com.zensar;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.IntPredicate;

public class BiConsumerExample {
	
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		addEmployees(list);
		
		BiConsumer<Employee, Double> biConsumer=(e,number)->e.setSalary(e.getSalary()+number);
		for(Employee e:list) {
			
			biConsumer.accept(e, 500.0);
		}
		
		list.forEach(System.out::println);
		
		
	}
	
	public static void addEmployees(List<Employee> list) {
		list.add(new Employee(1, "uday",2000));
		list.add(new Employee(2, "kalluri",3000));
		list.add(new Employee(3, "saketh",40000));
		list.add(new Employee(2, "krishna",5000));
		
	}

}

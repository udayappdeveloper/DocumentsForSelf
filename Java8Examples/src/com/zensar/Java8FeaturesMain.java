package com.zensar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8FeaturesMain {

	public static void main(String[] args) {
		// functionexample # apply method
		functionExample();
		
		functionExample2();
		functionExampleAndThen();
		// predicate example #test
		predicateExample();
		// lambda test

		lambdaTest();
		// lambda test
		sayHelloLambda();

		// comparatorexampleWithLambda
		comparatorExampleWithLambda();
		// Thread Example With Lambda

		threadExampleWithLambda();
		// preicateTest1

		predicateTest1();

		predicateTestAnd_Negate();

	}

	public static void functionExample() {
		System.out.println("*********Function<Integer, Integer>*********");
		
		Function<Integer, Integer> value = a -> a * a;
		System.out.println(value.apply(2));

	}
	
	public static void functionExample2() {
		System.out.println("*********Function<String, Boolean> example 2*********");
		Function<String, Boolean> value = a -> a .length()>5;
		System.out.println(value.apply("Narendra Modi1"));

	}
	
	public static void functionExampleAndThen() {
		System.out.println("*********Function Andthen example 3*********");
		Function<Integer, Integer> fun1 = i->2*i;
		Function<Integer, Integer> fun2 = i->i*i*i;
		System.out.println(fun1.andThen(fun2).apply(3));//6
		System.out.println(fun1.compose(fun2).apply(3));

	}

	public static void predicateExample() {
		System.out.println("*********Predicate<Integer>***********");
		Predicate<Integer> value = a -> a % 2 == 0;
		System.out.println(value.test(2));

	}

	public static void lambdaTest() {
		Sample sample = () -> {
			return "abc";
		};
		System.out.println(sample.print());

	}

	public static void sayHelloLambda() {
		Sample1 sample1 = () -> {
			System.out.println("Hi This is Lambda Test");
		};
		sample1.sayHello();
	}

	public static void comparatorExampleWithLambda() {
		System.out.println("Comparator example");

		List<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(25);
		al.add(12);
		al.add(15);
		al.add(5);

		Comparator<Integer> c = (a, b) -> a > b ? 1 : a < b ? -1 : 0;
		Collections.sort(al, c);
		// al.stream().sorted(c);
		al.stream().forEach(System.out::println);
		// System.out.println(al);
		System.out.println("Even List example with Filter");
		List<Integer> evenList = al.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
		evenList.stream().forEach(System.out::println);
	}

	public static void threadExampleWithLambda() {
		System.out.println("Thread Example With Lambda");
		Runnable r1 = () -> {

			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}

		};
		new Thread(r1).start();

	}

	public static void predicateTest1() {

		System.out.println("Predicate length test");
		String[] str = { "don", "Tom", "Narendra Modi", "Rahul", "Sonia" };
		Predicate<String> predicateTest = i -> i.length() > 4;
		for (String str1 : str) {
			if (predicateTest.test(str1)) {
				System.out.println(str1);
			}
		}

	}

	public static void predicateTestAnd_Negate() {
		System.out.println("***********Predicate and() and nagete()");
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "uday", 1000));
		list.add(new Employee(2, "kalluri", 2000));
		list.add(new Employee(3, "RAHUL GEORGE", 10000));
		list.add(new Employee(4, "DANIEL RAJ", 20000));
		Predicate<Employee> predicate1 = e -> e.getName().length() > 5;
		Predicate<Employee> predicate12 = e -> e.getSalary() >= 10000;
		for (Employee e : list) {
			if (predicate1.and(predicate12).test(e)) {
				System.out.println(e);
			}
		}
		System.out.println("***********Predicate nagete()");
		for (Employee e : list) {
			if (predicate1.and(predicate12).negate().test(e)) {

				System.out.println(e);
			}
		}
	}
}
package com.zensar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {

		List<Integer> studentMarks = new ArrayList<>();

		studentMarks.add(10);
		studentMarks.add(20);
		studentMarks.add(70);
		studentMarks.add(30);
		studentMarks.add(40);
		studentMarks.add(50);
		studentMarks.add(80);
		studentMarks.add(90);
		studentMarks.add(100);

		List<Integer> failedStds = studentMarks.stream().filter(i -> i < 35).collect(Collectors.toList());

		System.out.println(failedStds);

		long failedStdCount = studentMarks.stream().filter(i -> i < 35).count();
		System.out.println("failed student count is:" + failedStdCount);

		List<Integer> newList = studentMarks.stream().map(i -> i * i).collect(Collectors.toList());

		System.out.println(newList);

	}

}

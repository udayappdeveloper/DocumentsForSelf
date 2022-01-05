package com.zensar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithSortedList {
	
	public static void main(String[] args) {
		
		
		List<String> namesList=new ArrayList<>();
		
		namesList.add("uday");
		namesList.add("kalluri");
		namesList.add("saketh");
		namesList.add("suma");
		namesList.add("praveen");
		namesList.add("srinivas");
		namesList.add("veeranna");
		namesList.add("roshan");
		namesList.add("laxmi Priya");
		namesList.add("uday Kalluri");
		
		List<String> sortedList=	namesList.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(sortedList);	
	}

}

package com.zensar;

public class DefaultMethodExample implements Sample {

	@Override
	public String print() {
		return null;
	}

	@Override
	public void sayHello() {
		System.out.println("default method overrided");
	}
	
	public static void main(String[] args) {

		Sample defaultMethodExample=new DefaultMethodExample();
		defaultMethodExample.sayHello();;
	}

}

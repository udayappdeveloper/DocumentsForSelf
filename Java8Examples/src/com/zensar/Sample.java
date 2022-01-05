package com.zensar;
@FunctionalInterface
public interface Sample {
	public String print();
	
	default public void sayHello() {
		
		System.out.println("DefaultIMpel");
	}
	
	

}

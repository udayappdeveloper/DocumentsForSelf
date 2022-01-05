package com.zensar;

public class ConstructorReference {
	
	public static void main(String[] args) {
		
		Inter inter=Sam::new;
		Sam s=inter.getSample();
		
	}
	

}


class Sam{
	
	
}


 interface Inter{
	 
	 public Sam getSample();
	
	
}

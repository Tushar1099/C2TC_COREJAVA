package com.tns.GenericMethods;

public class GenericMethodDemo {

	public static void main1(String[] args) { 
		
	}
	
		public <T> void methodgen(T var1) {
			System.out.println("The value passed is of type"+var1.getClass().getSimpleName());
		}
		public static void main(String[] args) {
		
			GenericMethodDemo obj = new GenericMethodDemo();
			obj.<String>methodgen("Hello");
			
			obj.methodgen("Learning Java");
			obj.methodgen(154);
		

	}
}
package com.tns.Excercise;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=sc.nextLine(); //String that is to be Reversed  
		
		char[] c = s.toCharArray(); //Convert string into array   
		for (int i = c.length-1; i >= 0 ; i--) 
		{
			System.out.print(c[i]);
		}
	}
}
package com.tns.Excercise;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int r;  
		int rev=0; 
		int m=n;
		while(n>0) {
			r = n % 10;  //getting remainder
			rev= rev*10 + r; //reversing the number	
			n = n/10;
			
		}
		System.out.println(rev+" is a reversed number");

	}

}
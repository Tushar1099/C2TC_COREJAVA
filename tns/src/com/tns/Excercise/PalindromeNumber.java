package com.tns.Excercise;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int r;  
		int rev=0; 
		int m=n;
		while(n>0) {
			r = n % 10;  //getting remainder
			rev= rev*10 + r;
			n = n/10;
			
		}
		System.out.println(rev);

		if(rev==m) {
			System.out.println("it is palindrome number ");
		}
		else
		{
			System.out.println("it is not a palindrome number");
		}
	}

}
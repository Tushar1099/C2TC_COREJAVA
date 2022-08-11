package com.tns.Excercise;

public class PalindromeString {
	String s = "level";
	String rev = "";{
		
	for (int i = s.length()-1; i >= 0; i--) 
	{
		rev = rev + s.charAt(i);
	}
	if (rev.equalsIgnoreCase(s))
	{
		System.out.println("String is Palindrome.");
	}
	else 
	{
		System.out.println("Not a palindrome.");
	}
}
}
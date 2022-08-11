package com.tns.GenericMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WildCardDemo {

	public static void main(String[] args) {
		List<Integer> i=Arrays.asList(10,52,78,14,2,5,6);                               

		List<Double> d=Arrays.asList(1.2,4.5,85.2,6.4,44.44);  
		
		printList(i);
		printList(d);
 
	}
	
	public static void printList(List<?> list)
	{
		System.out.println(list);
	}

}
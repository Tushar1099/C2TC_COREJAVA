package com.tns.ArraySorting;

public class Sort {

	public static void main(String[] args) {
		System.out.println("Sorted in Ascending order.");
		
		int arr[]= {10,9,40,5,8,3,45};
		
		
		for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++) {
				
				int temp=0;
				if(arr[j] <  arr[i]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			System.out.print(arr[i]+" ");
		}

	}

}
package com.tns.GenericMethods;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
        ArrayList list = new ArrayList();
		
		list.add("Java");
		
		list.add(123);
		
		for(Object object : list)
			
		{
			//Below statement throws ClassCastException at run time.
			
			String str = (String) object;  //Type casting
			
			System.out.println(str);
		}
	}

	}

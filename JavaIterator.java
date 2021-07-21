package com.myprog.program;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {

	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<String>();//initialize array list with string 
		cars.add("volvo3");//adding elements 
		cars.add("volvo4");
		cars.add("volvo5");
		cars.add("volvo0");
		cars.add("volvo1");
		cars.add("volvo2");
		
		System.out.println(cars);
		
		Iterator<String> it=cars.iterator();
		System.out.println(it.next());// prints first element in the list
		
		while(it.hasNext()) {
			System.out.println(it.next());//prints all elements
		}
		
		cars.remove("volvo5");
		System.out.println(cars);
	
	// we can also use for Integers and so on.
	}

}

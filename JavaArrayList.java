package com.myprog.program;

import java.util.ArrayList;
import java.util.Collections;
public class JavaArrayList 
{

	public static void main(String[] args) 
	{
		System.out.println("ArrayLIst with specified String array dayatype:");
		ArrayList<String> cars=new ArrayList<String>();//initialize array list with string 
		cars.add("volvo3");//adding elements 
		cars.add("volvo4");
		cars.add("volvo5");
		cars.add("volvo0");
		cars.add("volvo1");
		cars.add("volvo2");
		
		System.out.println(cars);
		
		Collections.sort(cars);  //sorting strings based on alphabetical order
		for(String i:cars) {//for loop
			System.out.println(i);
		}// for sorting all elements should be same time
		
		System.out.println(cars.get(5));//calling with index number
		cars.set(0, null);//setting null at position 0
		System.out.println(cars);
		cars.set(3, null);//setting null at position 3
		System.out.println(cars);
		cars.set(4, "audi");// setting string at 4th position
		System.out.println(cars);
		cars.remove(2);//removing elements
		System.out.println(cars);
		System.out.println(cars.size());//size
		cars.clear();//clear all elements in the list
		System.out.println(cars);
		
		System.out.println("ArrayList with Integer wrapper Object Data type:");
		ArrayList<Integer> inti=new ArrayList<Integer>();//integer type=wrapper object int
		inti.add(25);
		inti.add(205);
		inti.add(625);
		inti.add(43);
		System.out.println(inti);
		
		Collections.sort(inti);
		
		for(int i : inti) {
			System.out.println(i);
		}
		
		System.out.println("ArrayList with Not mentioning any wrapper Object Datatype:");
		ArrayList alltype=new ArrayList();//all type by mentioning nothing type
		alltype.add("17mis7146");
		alltype.add(7146);
		alltype.add(1.7);
		alltype.add(true);
		alltype.add(false);
		System.out.println(alltype);
		alltype.remove(2);// delete 2nd element
		alltype.remove(2);// delete 2nd element after array list is  modifying from upper line
		System.out.println(alltype);
		
		
		
	}

}

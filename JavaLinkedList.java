package com.myprog.program;

import java.util.Collections;
import java.util.LinkedList;
public class JavaLinkedList 
{
// both array and linked lists are same but linked list have store and linked with containers
	// array list is normal one . both have same methods but concepts are different.array is contiguous and linked list is linked blocks
	public static void main(String[] args) 
	{
		System.out.println("LinkedList with specified String array dayatype:");
		LinkedList<String> cars=new LinkedList<String>();//initialize array list with string 
		cars.add("audi");//adding elements 
		cars.add("alwa");
		cars.add("bench");
		cars.add("volvo");
		cars.add("toyota");
		cars.add("manchidhi");
		
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
		System.out.println();

		System.out.println("LinkedList with Integer wrapper Object Data type:");
		LinkedList<Integer> inti=new LinkedList<Integer>();//integer type=wrapper object int
		inti.add(25);
		inti.add(205);
		inti.add(625);
		inti.add(43);
		System.out.println(inti);
		
		Collections.sort(inti);
		
		for(int i : inti) {
			System.out.println(i);
		}
		
		System.out.println();

		
		System.out.println("LinkedList with Not mentioning any wrapper Object Datatype:");
		LinkedList alltype=new LinkedList();//all type by mentioning nothing type
		alltype.add("17mis7146");
		alltype.add(7146);
		alltype.add(1.7);
		alltype.add(true);
		alltype.add(false);
		System.out.println(alltype);
		alltype.remove(0);
		System.out.println(alltype);
		System.out.println();

		
		// additional methods of linked list. these methods does not work in array list
		System.out.println("Additional method for linked list");
		alltype.addFirst(2);// add first element position
		alltype.addLast(46);//add last element position
		System.out.println(alltype);
		System.out.println(alltype.getFirst());//get first element in the linked list
		System.out.println(alltype.getLast());//get last element in the list
		alltype.removeFirst();//removing first element in the linked list
		alltype.removeLast();//removing last element in the linked list
		System.out.println(alltype);
		
		
	}

}

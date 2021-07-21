package com.myprog.program;

public class StringConcat {

	public static void main(String[] args) {
		String greeting="Hello ",greetings="he\"llo";
		System.out.println("the result is "+greeting.length());//length
		System.out.println("the result is "+greeting.toUpperCase());//capital letters
		System.out.println("the result is "+greeting.toLowerCase());//smaller letters
		System.out.println("the result is "+greeting.indexOf("e"));//searching element in string through index
		
		String toYou="how are you";
		System.out.println(greeting+toYou);			//concatation
		System.out.println(greeting.concat(toYou));	//concatation

		String s1="hi ";
		int i1=20;
		String s2=" hello";
		int i2=22;
		System.out.println("the result is "+s1+s2);//concatation of string + integer
		System.out.println("the result is "+s1+i2);
		System.out.println("the result is "+i1+s2);
		System.out.println("the result is "+(i1+i2));

	}

}

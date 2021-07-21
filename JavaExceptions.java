package com.myprog.program;

public class JavaExceptions 
{

	public static void main(String[] args) 
	{
		// prints some message instead of getting error
		System.out.println("This is normal try catch exceptions:-");
		try{
			int[] myNum= {1,2,3};
			System.out.println(myNum[10]);
		}catch(Exception e) {
			System.out.println("	something went wrong.	");
		}
		finally {// this prints anyway if anything happen/this is extra. catch is enough
			System.out.println("	This is testing.		");
		}
		System.out.println();
		
		
		
		//throw keyword
		System.out.println("This is throw key word exception:-");
		int age=20;
		if(age<18) {
			throw new ArithmeticException("	access denied.	");
		}
		else {
			System.out.println("	access granted.	");
		}
	}

}

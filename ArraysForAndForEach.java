package com.myprog.program;

public class ArraysForAndForEach {

	public static void main(String[] args) {
		int[] age= {18,19,20,21,22};   			//for loop in Array
		for(int i=0;i<age.length;i++)
		{
			System.out.println("wish you very\n   happy birthday| age: "+ age[i]);
		}
		
		
		int[] Age= {18,19,20,21,22};          // for each loop in Array
		for(int i:Age)
		{
			System.out.println( "You are age is : " + i);
		}
	}

}

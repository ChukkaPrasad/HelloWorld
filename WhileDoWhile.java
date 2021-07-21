package com.myprog.program;

public class WhileDoWhile {

	public static void main(String[] args) {
		
		
		int age=21;
		while(age>22) 			//while loop : loop does not execute  while the statement is false
		{
			System.out.println("you are a men now and a great software engineer: "+age);
			age++;
		}
		
		int Age=21;				// do while : it execute at least once while the statement is false
		do
		{
			System.out.println("you are a great software engineer ".toUpperCase());
		}while(Age==22);	}

}

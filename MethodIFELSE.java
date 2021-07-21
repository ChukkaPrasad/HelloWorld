package com.myprog.program;

public class MethodIFELSE
{
	public static void main(String[] args) 
	{
		checkAge(22);//calling method,22 is argument
	}
	public static void checkAge(int i)//not returning any thing,i is parameter
	{
		if(i<18)// it common to use if/else in methods
		{
			System.out.println("you are under eighteen");
		}
		else
		{
			System.out.println("you are a major");
		}
	}
}

package com.myprog.program;

public class MethodParametersAndArguments
{
	public static void main(String[] args)
	{
		details("Prasad",22);// arguments
		details("Yogi",15);// arguments
	}
	public static void details(String name,int age)//parameters
	// void makes returns nothing
	{
		String detail="My Name is Chukka "+name+". My Age is "+age;
		System.out.println(detail);
	}

}

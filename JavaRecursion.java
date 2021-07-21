package com.myprog.program;

public class JavaRecursion 
{

	public static void main(String[] args) 
	{
		System.out.println(sum(10));
		System.out.println(sum(5,10));
		System.out.println(sum(5.0,10.0));
		System.out.println(factorial(10));

	}
	public static int sum(int k)//recursion upto sum of 10 numbers
	{
		if(k>0)
		{
			return k+sum(k-1);
		}
		else
			return 0;
	}
	public static int sum(int i,int j)//Recursion sum of from 5 to 10
	{
		if(i<j) {				//10+9+8+7+6+5
			return j+sum(i,j-1);// it calls it self until
		}						//	the statement is false and return everything 
		else
			return i;//both 5,10 are including so 5 added at the last call
	}
	public static double sum(double i,double j)//Recursion sum of from 5 to 10
	{
		if(i<j) {				//5+6+7+8+9+10
			return i+sum(i+1,j);// it calls it self until
		}						//	the statement is false and return everything 
		else
			return j;//both 5,10 are including so 10 added at the last call
	}
	public static int factorial(int k)//recursion for factorial
	{
		if(k>0)
		{
			return k*factorial(k-1);
		}
		else
			return 1;
	}

}
/*
10	
10	9	
10	9	8
10	9	8	7
10	9	8	7	6
10	9	8	7	6	5
10	9	8	7	6	5	4	
10	9	8	7	6	5	4	3	
10	9	8	7	6	5	4	3	2
10	9	8	7	6	5	4	3	2	1 = 55
*/

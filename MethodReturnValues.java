package com.myprog.program;

public class MethodReturnValues
{
	public static void main(String[] args)
	{
		System.out.println(add(22,25468));
		System.out.println(sub(1254,152));//calling methods
		System.out.println(mul(24,564));
	}
	public static int add(int x,int y)//method returns in integer
	{									//so 'int' mentioned by removing void
		return x+y;						// we should not use void here
	}
	public static int sub(int x,int y)
	{
		return x-y;//returning values of subtraction
	}
	public static int mul(int x,int y)
	{
		return x*y;
	}

}

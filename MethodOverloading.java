package com.myprog.program;

public class MethodOverloading 
{
	public static void main(String[] args)
	{
		System.out.println(add(1,5));
		System.out.println(add(2.0,3));
		System.out.println(add(2,5.3));
	}
	public static int add(int x,int y)
	{
		return x+y;
	}
	public static float add(float x,float y)
	{
		return x+y;
	}
	public static double add(double x,double y)
	{
		return x+y;
	}
}

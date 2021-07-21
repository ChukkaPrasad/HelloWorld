package com.myprog.program;

class OuterClasss 
{
	int x=10;
	static class InnerClass// mentioning static for accessing inner class by creating
	// inner class object directly ,static keyword tells it belongs to the class
	{ 
		int y=7;
	}
}
public class StaticInnerClass
{
	public static void main(String[] args) 
	{
		OuterClasss.InnerClass myinner=new OuterClasss.InnerClass();
		System.out.println(myinner.y);
	}
}


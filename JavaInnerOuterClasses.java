package com.myprog.program;

class OuterClass 
{
	int x=8;
	public void outerMethod()
	{
		System.out.println("This is outer method");
	}
	
	class InnerClass
	{
		int y=5;
		public int innerMethod()
		{
			return x;
		}
		public void innerMethod2()
		{
			 outerMethod();
		}
	}
	private class InnerClass2
	{
		int z;
	}
	
}
public class JavaInnerOuterClasses 
{
	public static void main(String[] args) 
	{
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic=oc.new InnerClass();
		System.out.println(oc.x+ic.y);
		
		System.out.println(ic.innerMethod());
		// inner class can access all variables and methods off outer class
		ic.innerMethod2();// instead of private attributes and methods
		// only if we call in inner class
		
		/*
		OuterClass.InnerClass2 ic2=oc.new InnerClass();
		System.out.println(ic2.z);*/  // private class can't be accessed by any object
	}

}

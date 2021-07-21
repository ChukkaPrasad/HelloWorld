package com.myprog.program;

interface interface1
{
	public void method1();
	public void method2();
}

class Normal implements interface1
{
	public void method1()
	{
		System.out.println("This is a interface method1");
	}
	public void method2()
	{
		System.out.println("This is a interface method2");
	}
}


public class JavaInterface {

	public static void main(String[] args) {
		Normal inter=new Normal();
		inter.method1();
		inter.method2();
	}

}

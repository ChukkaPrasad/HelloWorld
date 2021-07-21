package com.myprog.program;

public class StaticVsNonStaticPublicMethods {
	public void methodNonStatic() {
		System.out.println("Non static method - PUBLIC");
	}
	static void methodStatic() {
		System.out.println("This is static method - STATIC");
	}

	public static void main(String[] args) {
		methodStatic();
		//methodNonStatic(); it makes error , to access
		//this method we should mention create object
		StaticVsNonStaticPublicMethods obj= new StaticVsNonStaticPublicMethods();
		obj.methodNonStatic();
	}

}

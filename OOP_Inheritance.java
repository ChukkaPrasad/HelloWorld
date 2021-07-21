package com.myprog.program;

class Vehicle 
{
	protected String brand="Ford";
	public void honk()
	{
		System.out.println("Tuut,tuut.....");
	}
}
public class OOP_Inheritance  extends Vehicle 
{
	private String modelname="Mustang";

	public static void main(String[] args) 
	{
		OOP_Inheritance car=new OOP_Inheritance();
		car.honk();
		System.out.println(car.brand+" "+car.modelname);
		
	}

}

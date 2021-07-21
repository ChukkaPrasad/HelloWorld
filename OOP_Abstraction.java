package com.myprog.program;

abstract class Animals
{
	public abstract  void animalsound();//abstract method
	public void sleep() // normal method
	{
		System.out.println("zzzzz....");
	}
}
class Pigs extends Animals//inherits from animal
{
	public void animalsound()// provides body for abstract method
	{
		System.out.println("The pigs say: wee wee");
	}

}
public class OOP_Abstraction 
{
	public static void main(String[] args)
	{
		Pigs mypig=new Pigs();//creating object
		mypig.animalsound();//calls abstract method
		mypig.sleep();//call normal method
	}

}

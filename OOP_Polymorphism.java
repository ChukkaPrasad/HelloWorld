package com.myprog.program;

class Animal
{
	public void animalsound()
	{
		System.out.println("The animal makes sound");
	}
}
class Pig extends Animal
{
	public void animalsound()
	{
		System.out.println("The pigs says: wee wee");
	}
}
class Dog extends Animal 
{
	public void animalsound()
	{
		System.out.println("The dog says: bow bow");
	}
}
public class OOP_Polymorphism {

	public static void main(String[] args) {
		Animal ani=new Animal();
		Animal piggy = new Pig();
		Animal doggy= new Dog();
		ani.animalsound();
		piggy.animalsound();
		doggy.animalsound();
	}

}

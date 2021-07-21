package com.myprog.program;

public class IfElseTernary
{

	public static void main(String[] args) 
	{
		
		//normal if else
		boolean istasty=true;
		if(istasty==true)
		{
			System.out.println("food is tasty".toUpperCase());  
		}
		else 
			System.out.print("food is not that much taste".toUpperCase());
		
		// ternary operator for if else
		
		boolean isTasty=true;								
		String Taste = (isTasty==true)?"food is tasty".toUpperCase():"food is "
				+ "not that much taste".toUpperCase();
		System.out.println(Taste);
		
		
	}

}

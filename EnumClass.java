package com.myprog.program;

public class EnumClass
{	enum Level
	{
		LOW,
		MEDIUM,
		HIGH;
	}
	public static void main(String[] args)
	{
		for(Level myvar:Level.values()) {	// for loop
			System.out.println(myvar);
		}
		
		Level myvar=Level.MEDIUM;
		
		System.out.println(myvar);
		
		switch(myvar) {				// switch statement
		case LOW :
			System.out.println("This is low");
			break;
		case MEDIUM :
			System.out.println("This is Medium");
			break;
		case HIGH :
			System.out.println("This is High");
			break;
			
		}
		
		
		
	}

}

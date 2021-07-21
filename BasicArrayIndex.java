package com.myprog.program;

public class BasicArrayIndex
{
	public static void main(String[] args)
	{
		String[] birthday= {"Yogi","Myself","Hema"};
		
		System.out.println(birthday[0].toLowerCase());
		System.out.println(birthday[1].toLowerCase());
		System.out.println(birthday[2].toLowerCase());
		System.out.println(birthday.length);
		
		birthday[0]="yogendra";
		birthday[1]="prasad";
		
		for(String i:birthday)
		{
			System.out.println(i.toUpperCase());
		}
		
		

	}

}

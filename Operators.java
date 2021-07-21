package com.myprog.program;

public class Operators
{	
	public static void main(String[] args) 
	{	
		int f=6,ff=2;
		System.out.println("assignment operators:");
		System.out.println(f+=3);
		System.out.println(f-=3);
		System.out.println(f*=3);	 			//assignment operators
		System.out.println(f/=3);
		System.out.println(f);
		System.out.println(f%=3);
		System.out.println();
		
		System.out.println("logical operators:");
		System.out.println(f==0&&ff==25);		//logical operators
		System.out.println(f==0||ff==25);
		System.out.println(!(ff==25));
		System.out.println();
		
		f=6;
		ff=2;
		System.out.println("binary bitwise operators:");
		System.out.println(f&ff);				//bitwise operators
		System.out.println(f|ff);
		System.out.println(~ff);
		System.out.println(f^ff);
		System.out.println(f<<ff);
		System.out.println(f>>ff);
		System.out.println(f>>>ff);	
	}

}

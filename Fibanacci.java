package com.myprog.program;

public class Fibanacci {
 // sum of previous elements
	static int n1=0;
	static int n2=1;
	static int n3;
	 static void fibanacci(int count) {
		//0 1 1 2 3 5 8 13
		if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         fibanacci(count-1);    
	     }    
	}	
	public static void main(String[] args) {
		int count=10;    
		  System.out.print(n1+" "+n2);//printing 0 and 1    
		  fibanacci(count-2);// already two numbers printed
	}

}

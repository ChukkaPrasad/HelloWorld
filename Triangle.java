package com.myprog.program;

import java.util.Scanner;

public class Triangle {

	public static int triangle(int a,int b,int c) {
		if (a + b <= c || a + c <= b || b + c <= a) 
            return 0; 
        else
            return 1; 
	}
	public static void equilateral(int a,int b,int c) {
		if (a==b&&b==c&&a==c) {
			System.out.println("This is equilateral Traingle");
		}
		else{
			System.out.println("This is not a equilateral triangle");
		}		
	}
	public static void isosceles(int a,int b,int c) {
		if (a==b&&b!=c&&a!=c) {
			System.out.println("This is isosceles Traingle");
		}
		else{
			System.out.println("This is not a isosceles triangle");
		}		
	}
	public static void scalene(int a,int b,int c) {
		if (a!=b&&b!=c&&a!=c) {
			System.out.println("This is scalene Traingle");
		}
		else{
			System.out.println("This is not a scalene triangle");
		}		
	}
	
	
	public static void main(String[] args) {

		Scanner triangle=new Scanner(System.in);
		System.out.println("Enter the all three Triagle values:");
		int a=triangle.nextInt();
		int b=triangle.nextInt();
		int c=triangle.nextInt();
		triangle.close();
		boolean booly;
		
        if ((triangle(a, b, c)) == 1) {
        	 booly=true;
            System.out.println("This is a Triagle"); 
        }
        else {
        	 booly=false;
            System.out.println("This is a not Triagle"); 
        }
        if(booly==true) {
        	equilateral(a,b,c);
        	isosceles(a,b,c);
        	scalene(a,b,c);
        }
        else {
        	System.out.println("and it not gonna form any triagle shape");
        }
	}

}

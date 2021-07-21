package com.myprog.program;

import java.util.Scanner;

public class JavaUserInputScanner {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name=input.nextLine();
		
		System.out.println("Enter your id:");
		String id=input.nextLine();
		
		System.out.println("Enter your age:");
		int age=input.nextInt();
		
		System.out.println("Enter your salary:");
		double salary=input.nextDouble();
		
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("age:"+age);
		System.out.println("salary:"+salary);
	}

}

package com.myprog.program;
import java.util.Scanner;

public class PCMDilemma {
	public static void main(String[] args) {
		
		char master[]= {'P','C','M'};
		
		Scanner sc=new Scanner(System.in);
		
		char arr[]=new char[3];

		System.out.println("Enter the Strings:");
		for(int i=0;i<3;i++) {
			String tst = sc.nextLine();
			char test=tst.charAt(i);
			arr[i]=test;
		}
		sc.close();
		
		for(int i=0;i<3;i++)
		{
			if(arr[i]==master[i]) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
				
	}
}


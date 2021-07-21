package com.myprog.program;

import java.lang.Math;

import java.util.Random;   

public class BVASummation {//Boundary Value Analysis Worst Case Testing

	public static void main(String[] args) {
	
		int num[]= {1,2,3};//first second third numbers in the range of the 1 to 50
		int n=5;
		int low=1,high=50;//range of 1 to 50
		int a[]= {Math.max(low,high),Math.min(low,high),Math.max(low,high)-1,Math.max(low,high)+1,low,high/2};//(1,2)
		int b[]= {Math.max(low,high),Math.min(low,high),Math.max(low,high)-1,Math.max(low,high)+1,low,high/2};//(1,2)
		int c[]= {Math.max(low,high),Math.min(low,high),Math.max(low,high)-1,Math.max(low,high)+1,low,high/2};//(1,2)
		int count=0;
		System.out.print("THE NUMBERS ARE	:	{");
		for(int i=0;i<num.length;i++) {
			System.out.print("	"+num[i]);
		}
		System.out.println("	}\nSUMMATION OF THREE NUMBERS IN A RANGE OF 1 TO 50");
		System.out.println("NUM1		NUM2 		NUM3			SUMMATION");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					System.out.println(a[i]+"	+	"+b[j]+"	+	"+c[k]+"	=	"+(a[i]+b[j]+c[k]));
					count++;
				}
			}
		}
		System.out.println("THE TOTAL NUMBER OF TEST CASES:	"+count);
	}

}

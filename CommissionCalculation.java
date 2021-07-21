package com.myprog.program;

import java.util.Scanner;

public class CommissionCalculation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int locks, stocks, barrels, tlocks=0, tstocks=0, tbarrels=0;
		float lprice=45.0f,sprice=30.0f,bprice=25.0f,lsales,ssales,bsales,sales,comm;
		
		System.out.print("Enter The number of locks and to exit The loop Enter -1 for locks: ");
		locks=sc.nextInt();
		
		while(locks!=-1) 
		{
			System.out.print("Enter The number of stocks: ");
			stocks=sc.nextInt();
			
			System.out.print("Enter The number of barrels: ");
			barrels=sc.nextInt();
			
			tlocks = tlocks+locks;
			tstocks = tstocks+stocks;
			tbarrels = tbarrels+barrels;
			
			System.out.print("\nEnter The number of locks and to exit The loop Enter -1 for locks: ");
			locks=sc.nextInt();
		}
		
		System.out.println("\nTotal locks = "+tlocks);
		System.out.println("Total stocks = "+tstocks);
		System.out.println("Total barrels = "+tbarrels);
		
		lsales = lprice*tlocks;
		ssales = sprice*tstocks;
		bsales = bprice*tbarrels;
		sales = lsales+ssales+bsales;
		
		System.out.println("Total sales= "+sales); 
		
		 if(sales > 1800.0)
		 {
			 comm=(float) (0.10*1000.0);
			 comm=(float) (comm+0.15*800);
			 comm=(float) (comm+0.20*(sales-1800.0));
			 System.out.println("The commission is = "+comm);
		}
		else if(sales > 1000)
		 {
			 comm =(float) (0.10*1000);
			 comm=(float) (comm+0.15*(sales-1000));
			 System.out.println("The commission is = "+comm);
		}
		else {
			 comm=(float) (0.10*sales);
			 System.out.println("The commission is = "+comm);
		 }
		 
		 sc.close();
	}
}


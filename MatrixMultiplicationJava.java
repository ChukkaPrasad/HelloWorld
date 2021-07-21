package com.myprog.program;
import java.util.Scanner;
public class MatrixMultiplicationJava 
{
	public static void main(String[] args)
	{
		int n,m,r,p;
		Scanner input = new Scanner(System.in);
		System.out.println("no.of columns should equal to no.of rows");
		
		System.out.println("Enter no.of rows and no.of columns of matrix 1:");
		n = input.nextInt();
		m = input.nextInt();
		
		System.out.println("Enter no.of rows and no.of columns of matrix 2:");
		r = input.nextInt();
		p = input.nextInt();
		if(m!=r) {
			System.out.println("given data is not equal");
		}else {
		int[][] m1 = new int[n][m];
		int[][] m2 = new int[r][p];
		int[][] mm = new int[n][p];
		
		//initializing matrix 1
		System.out.println("Enter the elements of 1st matrix row wise :");
		for (int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				m1[i][j] = input.nextInt();
			}
		}
		
		//initializing matrix 2
		System.out.println("Enter the elements of 2nd matrix row wise :");
		for (int i = 0; i < r; i++)
		{
			for(int j = 0; j < p; j++)
			{
				m2[i][j] = input.nextInt();
			}
		}
		
		//multiplication
		System.out.println("Multiplying the matrices : ");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < p; j++)
			{
				for(int k = 0; k < m; k++)
				{
					mm[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		
		//printing output
		System.out.println("Product mat multiplication is:");
		for (int i = 0; i < n; i++)
		{
			for(int j = 0; j < p; j++)
			{
				System.out.print(mm[i][j] + " ");
			}
			System.out.println();
		}
		input.close();

		}
	}
}


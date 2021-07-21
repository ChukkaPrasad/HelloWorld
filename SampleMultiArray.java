package com.myprog.program;

public class SampleMultiArray {

	public static void main(String[] args) {
		
		String [][] Multi= {{"heloo","hello","byeee","bye"},
				{"hello","byeee","heloo","hello"}};
		
		//printing throw the index
		System.out.println(" priting throw index: ");
		System.out.println(Multi[0][0].toUpperCase());
		System.out.println(Multi[0][1].toUpperCase());
		System.out.println(Multi[0][2].toUpperCase());
		System.out.println(Multi[0][3].toUpperCase());
		System.out.println(Multi[1][0].toUpperCase());
		System.out.println(Multi[1][1].toUpperCase());
		System.out.println(Multi[1][2].toUpperCase());
		System.out.println(Multi[1][3].toUpperCase());

		//printing throw loops of string values
		System.out.println(" printing throw loops of string values: ");

		for (int i = 0; i < Multi.length; i++)
	    {
	      for(int j = 0; j < Multi[i].length; j++)
	      {
	        System.out.println(Multi[i][j]);
	      }
	    }
		
		//printing throw loops of integer values
		System.out.println(" printing throw loops of integer values: ");
		
		int[][] num = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < num.length; ++i)
	    {
	      for(int j = 0; j < num[i].length; ++j)
	      {
	        System.out.println(num[i][j]);
	      }
	    }
	}
}

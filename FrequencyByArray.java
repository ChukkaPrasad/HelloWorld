package com.myprog.program;

public class FrequencyByArray
{
	public static void main(String[] args) 
	{
		int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
		int [] fr = new int [arr.length];  
		int visited = -1;  // use this variable we can delete repeated numbers
		for(int i = 0; i < arr.length; i++)
		{  
			int count = 1;  //counting
			for(int j = i+1; j < arr.length; j++)
			{  
				if(arr[i] == arr[j])//checking elements in array
				{  
					count++;  
					fr[j] = visited;  //we need to avoid all repeated elements in array
				}  
			}  
		     if(fr[i] != visited)  // prints if not visited
		    	 fr[i] = count;  // creases count
		 }  
		System.out.println("Element-Frequency");  
		for(int i = 0; i < fr.length; i++)
		{  
			if(fr[i] != visited)  
			System.out.println(arr[i] + "-" + fr[i]);  
		}    
	}

}

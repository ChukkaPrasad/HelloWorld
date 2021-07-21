package com.myprog.program;
import java.util.HashMap;
public class JavaHashMap 
{
	public static void main(String[] args)
	{// we can replace String as any type like Integer, Float,Boolean..etc
		HashMap<String,String> countryCapital=new HashMap<String,String>();//initialize hash map with string index and string values 
		
		countryCapital.put("England", "London");
		countryCapital.put("USA", "Washington DC");
		countryCapital.put("India", "Delhi");
		countryCapital.put("Austrelia", "Canberra");//counties and capitals
		countryCapital.put(null, null);
		countryCapital.put("hi", null);
		
		System.out.println(countryCapital);
		//for loop for fetching index(keys) 
		System.out.println();
		System.out.println("countries:-".toUpperCase());
		
		for (String i:countryCapital.keySet()) {
			System.out.println(i);
		}
		
		System.out.println();
		//for loop for fetching values
		System.out.println("capitals:-".toUpperCase());
		
		for (String i:countryCapital.values()) {
			System.out.println(i);
		}
		System.out.println();

		//some of methods in hash map
		System.out.println(countryCapital.get("England"));		
		System.out.println(countryCapital.get("India"));		
		System.out.println(countryCapital.size());
		
		countryCapital.remove("England");
		System.out.println(countryCapital);
		countryCapital.clear();
		System.out.println(countryCapital);
		
	}

}

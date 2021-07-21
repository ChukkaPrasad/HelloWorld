package com.myprog.program;
import java.util.HashSet;
public class JavaHashSet
{

	public static void main(String[] args) 
	{
		HashSet<String> hasi=new HashSet<String>();
		hasi.add("audi");//adding elements 
		hasi.add("alwa");
		hasi.add("bench");
		hasi.add("volvo");
		hasi.add("toyota");
		System.out.println(hasi);
		
		System.out.println(hasi.contains("volvo"));
		hasi.remove("volvo");//remove
		System.out.println(hasi);//no order
		System.out.println(hasi.size());//size
		hasi.add(null);
		hasi.add(null);// only one null printed
		System.out.println(hasi);
		hasi.clear();//clear all
		System.out.println(hasi);
		
		//same way we can do with Integer...etc
		
	}

}

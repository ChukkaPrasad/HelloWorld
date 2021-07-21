package com.myprog.program;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFileHandling 
{

	public static void main(String[] args)
	{
		try 
		{// create a file
			File file=new File("eclipseTextfile.txt");
			if(file.createNewFile()) {
				System.out.println("file created:"+file.getName());
			}
			else
			{
				System.out.println("file already existed.");
			}
		}catch(IOException e) {
			System.out.println("an error accured");
			e.printStackTrace();
		
		}
		
		try 
		{// write a file
			FileWriter writer=new FileWriter("eclipseTextfile.txt");
			writer.write(" iam chukka prasad, \nThis is my first file handling text. ");
			writer.close();
			System.out.println("successfully , wrote the file.");
		}catch(IOException e) 
		{
			System.out.println("an error accured.");
			e.printStackTrace();
		
		}
		
		try 
		{// read a file
			File file=new File("eclipseTextfile.txt");
			Scanner read=new Scanner(file);
			while(read.hasNextLine()) {
				String data=read.nextLine();
				System.out.println(data);
			}
			read.close();
		}catch(FileNotFoundException e) {
			System.out.println("an error accured.");
			e.printStackTrace();
		
		}
		
		//get all information of that file
		
		File file=new File("eclipseTextfile.txt");
		if(file.exists()) 
		{
			System.out.println("file name:"+file.getName());
			System.out.println("file path:"+file.getAbsolutePath());
			System.out.println("file writable:"+file.canWrite());
			System.out.println("file readable:"+file.canRead());			
			System.out.println("file size:"+file.length());
		}
		else
		{
			System.out.println("the file does not exist.");
		}
		
		/*we can delete that file or mentioning a file path
		File myfile=new File("clipseTextfile.txt");
		myfile.delete();
		or
		File myfile=new File("C:\Users\VITAP\eclipse-workspace\JAVA\eclipseTextfile.txt");
		myfile.delete();
		*/
	}

}

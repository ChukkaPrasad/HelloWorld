package com.myprog.program;

public class JavaConstructor {
	String name;
	String id;
	
	public JavaConstructor (String studentname,String studentid) {
		name=studentname;
		id=studentid;
	}
	
	public static void main(String[] args) {
		
	JavaConstructor stu=new JavaConstructor("Prasad","17MIS7146");
	
	System.out.println(stu.name);
	System.out.println(stu.id);
	
	}

}
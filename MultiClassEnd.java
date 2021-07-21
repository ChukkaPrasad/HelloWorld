package com.myprog.program;

public class MultiClassEnd {

	public static void main(String[] args) {
		MultiClassStart obj=new MultiClassStart();
		MultiClassStart obj2=new MultiClassStart();
		 System.out.println(obj.x);
		 System.out.println(obj.i);
		 //System.out.println(obj.j);private int cant access

		 obj.y=15;
		 System.out.println(obj.x+obj.y);
		 obj.tellmyname();
		 obj2.tellmyname();

	}

}

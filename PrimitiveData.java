package com.myprog.program;

public class PrimitiveData {

	public static void main(String[] args) {
		byte b=127;
		short s=32767;
		int i=2147483647;
		long l=13654615164684564l;//19 Numbers
		float f=2.0554645f;//7 digits after point value. 
		//if f more integers before point then total 8 integer digits with point value
		double d=5.024569874985d;//15 after point value
		boolean a= true;
		char c='a',q=56;
		System.out.println(b);//-128to127
		System.out.println(s);//-32767to+32767
		System.out.println(i);//-2147483647to2147483647
		System.out.println(l);//-19 Numbers to 19 Numbers
		System.out.println(f);//7 decimal digits
		System.out.println(d);//15 decimal digits
		System.out.println(a);
		System.out.println(c+" "+q); // ascii value
	}

}

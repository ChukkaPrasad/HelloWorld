package com.myprog.program;

public class TypeCasting {

	public static void main(String[] args) {
		
		// integer values
		long i=122346784644622l;
		int b=(int)i;
		System.out.println("widening type casting // manual type casting i to b  	  : "+b);
		byte c=127;								//widening type casting
		long lg=c;
		System.out.println(" narrowing type casting // automatic type casting b to l : "+lg);
		
		//floating values
		double d=1.784644622d;
		float fa=(float)d;						// narrowing type casting
		System.out.println("widening type casting // manual type casting d to f    : "+fa);
		float ff=12054.7f;
		double db=ff;
		System.out.println(" narrowing type casting // automatic type casting f to f : "+db);
	}

}

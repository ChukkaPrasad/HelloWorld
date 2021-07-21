package com.myprog.program;

class Encapsulation
{
	private String name;
	
	//getter
	public String getName() {
		return name;
	}
	
	//setter
	public void setName(String myname) {
		this.name=myname;
	}
}

public class OOP_Enacapsulation
{
	public static void main(String[] args)
	{
		Encapsulation obj = new Encapsulation();
		/* obj.name="PRASAD";		// we can't access the private variable directly
		System.out.println(obj.name);// for that we use Encapsulation method
		*/
		obj.setName("CHUKKA VARA PRASAD");
		obj.getName();
		System.out.println(obj.getName());
	}

}

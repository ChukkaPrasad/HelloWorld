package com.myprog.program;

interface interface01
{
	public void hi();
	public void bye();
}
interface interface02
{
	public void hello();
	public void howAreYou();
}
interface interface03
{
	public void okay();
	public void thankYou();
}

class MultiInterface implements interface01,interface02,interface03
{
	public void hi()
	{
		System.out.println("The interface says : Hi");
	}
	
	public void bye()
	{
		System.out.println("The interface says : Bye!");
	}
	
	public void hello()
	{
		System.out.println("The interface says : Hello");
	}
	
	public void howAreYou()
	{
		System.out.println("The interface says : How are you");
	}
	
	public void okay()
	{
		System.out.println("The interface says : Ok");
	}
	
	public void thankYou()
	{
		System.out.println("The interface says : Thank you");
	}
	
}


public class MultiInterface_insteadMultiInheritance {

	public static void main(String[] args) {
		MultiInterface interF=new MultiInterface();
		interF.hi();
		interF.hello();
		interF.howAreYou();
		interF.okay();
		interF.thankYou();
		interF.bye();
	}

}

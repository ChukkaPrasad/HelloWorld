package com.myprog.program;

public class JavaThreadsConcurrencyProblem extends Thread
{
	public static int amount=0;
	public static void main(String[] args)
	{
		JavaThreadsConcurrencyProblem mythread=new JavaThreadsConcurrencyProblem();
		mythread.start();
		while(mythread.isAlive()) {
			System.out.println("waiting.....");
		}
		System.out.println("JavaThreadsConcurrencyProblem:"+amount);
		amount++;
		System.out.println("JavaThreadsConcurrencyProblem:"+amount);
		
		}
	public void run() {
		amount++;
	}

}
/*
// or we can use runnable interface to run thread , both work well

public class JavaThreadsConcurrencyProblem implements Runnable
{
	public static int amount=0;
	public static void main(String[] args)
	{
		JavaThreadsConcurrencyProblem mythread=new JavaThreadsConcurrencyProblem();
		Thread myThread=new Thread(mythread);
		myThread.start();
		while(myThread.isAlive()) {
			System.out.println("waiting.....");
		}
		System.out.println("JavaThreadsConcurrencyProblem:"+amount);
		amount++;
		System.out.println("JavaThreadsConcurrencyProblem:"+amount);
		
		}
	public void run() {
		amount++;
	}

}
*/

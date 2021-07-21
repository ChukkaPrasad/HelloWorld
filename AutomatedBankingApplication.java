package com.myprog.program;

import java.util.Scanner;

public class AutomatedBankingApplication {
public static int regMobileNum;
public static int newMobileNum;
public static int password;
public static int birthYear;
public static int mobileBankPIN;
public static long userPAN;

	static void checkBalance() {
		System.out.println("You don't have any Balance \n Your Balance is : 0 \nThankYou.");
	}
	static void checkLastFiveTransactions() {
		System.out.println("You Have Not Done any Transactions Yet. Thankyou.");
	}
	static void changeMobileNumber() {
		System.out.println("PLEASE ENTER YOUR REGISTERED MOBILE NUMBER:");
		Scanner sc=new Scanner(System.in);
		regMobileNum=sc.nextInt();
		System.out.println("ENTER YOUR NEW MOBILE NUMBER:");
		newMobileNum=sc.nextInt();
		regMobileNum=(int)newMobileNum;
		System.out.println("Your Registered Mobile Now is:"+regMobileNum+"\nThankYou.");
		sc.close();
		
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE REGISTERED MOBILE NUM:");
		regMobileNum=sc.nextInt();
		System.out.println("ENTER THE PASSWORD:");
		password=sc.nextInt();
		if((regMobileNum!=1234567890)||(password!=111)) {
			throw new ArithmeticException("	Wrong Creditionals");
		}
		else {
			System.out.println("Enter your Birth Year:");
			birthYear=sc.nextInt();
			if(birthYear!=2000) {
				throw new ArithmeticException("	Wrong year of Birth.");
			}
			else {
				System.out.println("Enter your Mobile Bank PIN:");
				mobileBankPIN=sc.nextInt();
				if(mobileBankPIN!=1234) {
					throw new ArithmeticException("	Wrong PIN , access denied.");
				}
				else {
					System.out.println("Enter Your PAN Number:");
					userPAN=sc.nextInt();
					if(userPAN!=1234123412) {
						throw new ArithmeticException("	Wrong PAN , access denied.");
					}
					else {
						System.out.println("CONGRATS!!,\n You Have Entered the AUTOMATED BANKING APPLICATION.");
						System.out.println("Enter the MENU:");
						System.out.println("1. Check The Balance\n 2.Check The Last Five Transactions\n 3.Change The Mobile Number");
						int menu=sc.nextInt();
						
						switch(menu) {
						case 1:
							checkBalance();
							break;
						case 2:
							checkLastFiveTransactions();
							break;
						case 3:
							changeMobileNumber();
							break;
							default:
								System.out.println("You Have Entered Wrong Menu. ThankYou.");
								sc.close();
						}
					}
				}
			}
		}
		
		
	}

}

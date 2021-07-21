package com.myprog.program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegularExpressions_RegEx 
{

	public static void main(String[] args) 
	{
		Pattern pattern=Pattern.compile("chukka prasad",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher("Hello, I am Chukka Prasad");
		boolean matchFound=matcher.find();
		if(matchFound) {
			System.out.println("Match Found");
		}
		else {
			System.out.println("Match not Found");
		}
	
	}// check the some of the concepts left the w3school as regEx.

}

package com.myprog.program;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDateAndTime
{
	public static void main(String[] args) 
	{
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		
		DateTimeFormatter newformat=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String formatDate=datetime.format(newformat);
		System.out.println(formatDate);
		
	}

}

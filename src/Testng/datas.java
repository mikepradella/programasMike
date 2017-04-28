package Testng;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

public class datas {
	
	
	
	public static void main(String[] args) {
		
		System.out.println(java.time.LocalDate.now());
		System.out.println(java.time.LocalTime.now());
		System.out.println(java.time.LocalDateTime.now());
		System.out.println(java.time.Clock.systemUTC().instant());
		
		java.util.Date date =  new java.util.Date();
		
		System.out.println(date);
		
		long millis = System.currentTimeMillis();
		java.sql.Date date2 =  new java.sql.Date(millis);
		System.out.println(date2);
		
		LocalDate date3 = LocalDate.now();
		
		LocalDate yesterday = date3.minusDays(1);
		
		//LocalDate tommorow = date3.plusDays(daysToAdd)
		
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("before formatting  " + now);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formatDateTime = now.format(format);
		
		System.out.println("after formatting  "+formatDateTime);
		
		MonthDay month = MonthDay.now();  
	    LocalDate date4 = month.atYear(2015);  
	    System.out.println(date4);  
	}

	}




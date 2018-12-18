package com.oca8.module8.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDate_Test {

	public static void main(String[] args) {
//		LocalDate date = new LocalDate();
		System.out.println(LocalDate.now());
		
		System.out.println(LocalDate.MAX);
		
		LocalDateTime ld = LocalDateTime.now();
		System.out.println(ld);
		
//		DateTimeFormatter dtm = DateTimeFormatter.
		
		LocalDate bday = LocalDate.of(1985, 7, 8);
		System.out.println(bday);
		
		System.out.println(LocalDate.now().getYear() - bday.getYear()); 
	
		Period p = Period.of(1985, 7, 8);
		System.out.println(p);
		

        LocalDate d1 = LocalDate.parse("2015-02-05", DateTimeFormatter.ISO_DATE);
        LocalDate d2 = LocalDate.of(2015, 2, 5);
        LocalDate d3 = LocalDate.now();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
	}

}

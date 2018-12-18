package com.oca8.module8.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalTimeTest {

	public LocalTimeTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		System.out.println(LocalTime.now());
		System.out.println(LocalTime.parse("23:36:11").withMinute(33));
		
		System.out.println(LocalTime.now().atDate(LocalDate.now()));
		int x = 0;
		while(x < 10000)
			x++;
		
		System.out.println(LocalTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(LocalTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
	}

}

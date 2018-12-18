package com.oca8.module8.api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {

	public static void main(String[] args) {
		System.out.println(DateTimeFormatter.ISO_DATE.format(LocalDate.now()));
	}

}

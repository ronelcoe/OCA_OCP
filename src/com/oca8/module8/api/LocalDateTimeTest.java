package com.oca8.module8.api;

import java.time.LocalDateTime;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDateTime dt = LocalDateTime.parse("2015-01-02T17:13:05");
				System.out.println(dt);
	}

}

package com.oca8.module8.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class PeriodTest {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		now.plus(Period.ofDays(30));
		System.out.println(now);
		
		LocalDate christmas = LocalDate.of(Year.now().getValue(), Month.DECEMBER, 25);
		System.out.println(christmas);
		
		System.out.println(ChronoUnit.DAYS.between(now.toLocalDate(), christmas));
		
		System.out.println(ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.of(Year.now().getValue(), Month.DECEMBER, 25)));
		
		System.out.println(LocalDateTime.now().plus(Period.ofDays(-70)));
//		System.out.println(Period.between(LocalDate.now(), LocalDateTime.now().plus(Period.parse("p0y0m-70d"))));
		
	}

}

package com.codility;

import static org.junit.Assert.assertEquals;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DemoTemplate {

	public static void main(String arguments[]) {

		DemoTemplate service = new DemoTemplate();

		assertEquals(7, service.solution(2014, "April", "May", "Wednesday"));

		assertEquals(8, service.solution(2001, "April", "May", "Monday"));
		assertEquals(12, service.solution(2099, "February", "April", "Thursday"));

		assertEquals(4, service.solution(2016, "January", "January", "Friday"));

		assertEquals(8, service.solution(2016, "January", "February", "Friday"));
		assertEquals(51, service.solution(2016, "January", "December", "Friday"));

		
		System.out.println("DemoTemplate: Passed all test");
	}

	public int solution(int Y, String A, String B, String W) {
		// write your code in Java SE 8

		// This implementation does not use W - start of year week

		LocalDate A1st = LocalDate.of(Y, Month.valueOf(A.toUpperCase()), 1);
		LocalDate BLast = LocalDate.of(Y, Month.valueOf(B.toUpperCase()), 1).plusMonths(1).minusDays(1);

		// Work out when 1st Monday of the month is
		int daysToMonday = 0;
		if (A1st.getDayOfWeek() != DayOfWeek.MONDAY) {
			daysToMonday = DayOfWeek.SUNDAY.getValue() - A1st.getDayOfWeek().getValue() + 1;
		}
		LocalDate A1stMonday = A1st.plusDays(daysToMonday);

		// Work out when last Sunday of the month is
		int daysToSunday = 0;
		if (BLast.getDayOfWeek() != DayOfWeek.SUNDAY) {
			daysToSunday = BLast.getDayOfWeek().getValue() - DayOfWeek.MONDAY.getValue() + 1;
		}
		LocalDate BLastSunday = BLast.minusDays(daysToSunday);

		// Total weeks
		int weeks = (int) ChronoUnit.WEEKS.between(A1stMonday, BLastSunday.plusDays(1));

		return weeks;
	}

}
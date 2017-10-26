package com.codility;

import static org.junit.Assert.assertEquals;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DemoTemplate2 {

	public static void main(String arguments[]) {

		DemoTemplate2 service = new DemoTemplate2();

		assertEquals(7, service.solution(2014, "April", "May", "Wednesday"));

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

	public int solution2(int[] A) {
		// write your code in Java SE 8

		LocalDate A1st = LocalDate.of(2014, Month.APRIL, 1);
		LocalDate BLast = LocalDate.of(2014, Month.MAY, 1).plusMonths(1).minusDays(1);

		System.out.println(LocalDate.of(2014, Month.APRIL, 1).getDayOfWeek());
		System.out.println(
				LocalDate.of(2014, Month.APRIL, 1).getDayOfWeek().getValue() + " Sunday" + DayOfWeek.SUNDAY.getValue());
		System.out.println(LocalDate.of(2014, Month.MAY, 1));
		System.out.println(LocalDate.of(2014, Month.MAY, 1).plusMonths(1).minusDays(1));

		System.out.println("Days to Monday:" + (DayOfWeek.SUNDAY.getValue() - DayOfWeek.MONDAY.getValue()));
		System.out.println("Days to TUESDAY:" + (DayOfWeek.SUNDAY.getValue() - DayOfWeek.TUESDAY.getValue()));
		System.out.println("Days to SUNDAY:" + (DayOfWeek.SUNDAY.getValue() - DayOfWeek.SUNDAY.getValue()));

		int daysToMonday = 0;
		if (A1st.getDayOfWeek() != DayOfWeek.MONDAY) {
			daysToMonday = DayOfWeek.SUNDAY.getValue() - A1st.getDayOfWeek().getValue() + 1;
			System.out.println(daysToMonday);
		}
		LocalDate A1stMonday = A1st.plusDays(daysToMonday);
		System.out.println("Fly Monday: " + A1stMonday);

		int daysToSunday = 0;
		if (BLast.getDayOfWeek() != DayOfWeek.SUNDAY) {
			daysToSunday = BLast.getDayOfWeek().getValue() - DayOfWeek.MONDAY.getValue() + 1;
			System.out.println(daysToSunday);
		}
		LocalDate BLastSunday = BLast.minusDays(daysToSunday);
		System.out.println("Return Sunday: " + BLastSunday);

		System.out.println(A1stMonday.plusWeeks(7));
		System.out.println(ChronoUnit.WEEKS.between(A1stMonday, BLastSunday.plusDays(1)));

		return 0;
	}
}
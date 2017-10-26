package com.codility;

import static org.junit.Assert.assertEquals;

public class DWPTest {

	public static void main(String arguments[]) {

		DWPTest service = new DWPTest();

		assertEquals("WINTER", service.solution(new int[] { -1000, -14, -5, 7, 8, 42, 8, 3 }));

		assertEquals("AUTUMN", service.solution(new int[] { -1000, -14, -5, 7, 8, 42, -1000, 1000 }));
		assertEquals("AUTUMN", service.solution(new int[] { -1000, 999, -5, 7, 8, 42, -1000, 1000 }));
		
		
		assertEquals("SPRING", service.solution(new int[] { -1000, -14, -15, 1000, 8, 42, 8, 3 }));

		assertEquals("SPRING", service.solution(new int[] { 0, 0, -15, 1000, 0, 1, 8, 3 }));

		assertEquals("SUMMER", service.solution(new int[] { -14, -3, 7, -5, 42, 8, 3, 8 }));

		assertEquals("SUMMER", service.solution(new int[] { -3, -14, -5, 7, 8, 42, 8, 3 }));
		assertEquals("AUTUMN", service.solution(new int[] { 2, -3, 3, 1, 10, 8, 2, 5, 13, -5, 3, -18 }));

		System.out.println("DWPTest: Passed all test");
	}

	public String solution(int[] A) {
		// write your code in Java SE 8

		int daysInSeason = A.length / 4;
		int highestAmplitude = Integer.MIN_VALUE;
		int seasonWithHighestAmplitude = -1;

		// For each season
		for (int seasonNum = 0; seasonNum < 4; seasonNum++) {

			// This season's results
			int amplitude = 0;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int startOfSeason = seasonNum * daysInSeason;
			int endOfSeason = startOfSeason + daysInSeason;
			for (int i = startOfSeason; i < endOfSeason; i++) {
				max = Math.max(A[i], max);
				min = Math.min(A[i], min);
			}
			// This season's amplitude
			amplitude = max - min;

			// Check if season with highest amplitude
			if (amplitude > highestAmplitude) {
				seasonWithHighestAmplitude = seasonNum;
				highestAmplitude = amplitude;
			}
		}

		String seasonString = "";
		switch (seasonWithHighestAmplitude) {
			case 0:
				seasonString = "WINTER";
				break;
			case 1:
				seasonString = "SPRING";
				break;
			case 2:
				seasonString = "SUMMER";
				break;
			case 3:
				seasonString = "AUTUMN";
				break;
			default: // Not applicable
		}

		return seasonString;
	}
}
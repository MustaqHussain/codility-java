package com.codility;

import static org.junit.Assert.assertEquals;

public class TDDTemplate {

	public static void main(String arguments[]) {

		TDDTemplate service = new TDDTemplate();
		
		// Given, When, Then
		assertEquals(0, service.solution(""));

		System.out.println("TDDTemplate: Passed all test");
	}

	public int solution(String A) {
		// write your code in Java SE 8

		return 0;
	}

}
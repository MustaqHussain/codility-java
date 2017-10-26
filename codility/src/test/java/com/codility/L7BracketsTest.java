package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class L7BracketsTest {

	L7Brackets service;
	
	String a = "()";
	String b = "(())";
	String c = "(()";
	String d = "[]";
	String e = "";
	String f = "(";
	String n = "(()(())())";
	String w = "{[()()]}";
	String z = "([)()]";

	
	@Before
	public void setup() {
		service = new L7Brackets();
	}
	
	@Test
	public void empty() {
		assertEquals(1,service.solution(e));
	}
	
	@Test
	public void oneWFBracket() {
		assertEquals(1,service.solution(a));
	}
	@Test
	public void oneBracket() {
		assertEquals(0,service.solution(f));
	}
	@Test
	public void oneSquareBracket() {
		assertEquals(1,service.solution(d));
	}

	@Test
	public void mixedBracket() {
		assertEquals(1,service.solution(w));
	}
	
	@Test
	public void mixedNotWFBracket() {
		assertEquals(0,service.solution(z));
	}
	
	@Test
	public void nestingWFBracket() {
		assertEquals(1,service.solution(n));
	}
}

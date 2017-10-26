package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class L5CountDivTest {

	
	L5CountDiv service;
	
	@Before
	public void setup() {
		service = new L5CountDiv();
	}
	
	@Test
	public void none() {
		assertEquals(0, service.solution(1, 3, 5));
	}
	
	@Test
	public void one() {
		assertEquals(1, service.solution(0, 3, 2));
	}
	
	@Test
	public void two() {
		assertEquals(2, service.solution(1, 4, 2));
	}
	
	@Test
	@Ignore
	public void large() {
		assertEquals(2, service.solution(0, 4, 2));
	}
}

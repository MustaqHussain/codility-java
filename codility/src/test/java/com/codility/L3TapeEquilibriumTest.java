package com.codility;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.codility.L3TapeEquilibrium;

public class L3TapeEquilibriumTest {
	L3TapeEquilibrium service;
	
	int A[] = {3,1,2,4,3};
	int two[] = {3,1};
	
	@Before
	public void setup() {
		service = new L3TapeEquilibrium();
	}
	
	@Test
	public void two() {
		assertEquals(2, service.solution(two));
	}
	
	@Test
	public void five() {
		assertEquals(1, service.solution(A));
	}
}

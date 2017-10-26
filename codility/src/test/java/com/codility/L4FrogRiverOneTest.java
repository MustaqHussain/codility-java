package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class L4FrogRiverOneTest {

	L4FrogRiverOne service;
	
	int A[] = {1,3,1,4,2,3,5,4};
	
	@Before
	public void setup() {
		service = new L4FrogRiverOne();
	}
	
	@Test
	public void pos3() {
		assertEquals(4, service.solution(3, A));
	}

	@Test
	public void pos2() {
		assertEquals(4, service.solution(2, A));
	}
	
	@Test
	public void pos5() {
		assertEquals(6, service.solution(5, A));
	}

	@Test
	public void pos1() {
		assertEquals(0, service.solution(1, A));
	}
	
}

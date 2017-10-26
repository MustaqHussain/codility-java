package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class L6DistinctTest {
	L6Distinct service;
	
	int A[] = {2,1,1,2,3,1};
	int B[] = {2,1,1,2,2,1};
	int C[] = {2,1,1,0,2,1};
	int D[] = {3,3,3};
	int E[];
	
	@Before
	public void setup() {
		service = new L6Distinct();
	}
	
	@Test
	public void threeDistict() {
		assertEquals(3, service.solution(A));
	}
	
	@Test
	public void twoDistict() {
		assertEquals(2, service.solution(B));
	}	
	
	@Test
	public void zeroValueWithThreeDistict() {
		assertEquals(3, service.solution(C));
	}	
	
	@Test
	public void oneDistict() {
		assertEquals(1, service.solution(D));
	}
	
	@Test
	public void zeroDistict() {
		assertEquals(0, service.solution(E));
	}
}

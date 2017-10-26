package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class L4PermCheckTest {
	L4PermCheck service;
	
	int A[] = {4,1,3,2};
	int B[] = {4,1,3};
	int C[] = {2,3};
	
	@Before
	public void setup() {
		service = new L4PermCheck();
	}

	@Test
	public void ok() {
		assertEquals(1, service.solution(A));
	}
	
	@Test
	public void missing() {
		assertEquals(0, service.solution(B));
	}
	
	@Test
	public void oneMissing() {
		assertEquals(0, service.solution(C));
	}
	
	
}

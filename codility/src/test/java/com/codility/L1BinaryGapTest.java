package com.codility;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.codility.L1BinaryGap;

public class L1BinaryGapTest {

	L1BinaryGap service;
	
	@Before
	public void setup() {
		service = new L1BinaryGap();
	}

	@Test
	public void test_WhenZero() {
		assertEquals(0,service.solution(0));
	}
	
	@Test
	public void test_When9() {
		assertEquals(2,service.solution(9));
	}
	
	@Test
	public void test_When529() {
		assertEquals(4,service.solution(529));
	}
	
	@Test
	public void test_When20() {
		assertEquals(1,service.solution(20));
	}
	
	@Test
	public void test_When15() {
		assertEquals(0,service.solution(15));
	}
	
	@Test
	public void test_When1041() {
		assertEquals(5,service.solution(1041));
	}	
	
	@Test(expected = RuntimeException.class)
	public void test_WhenNegative() {
		service.solution(-1041);
	}	
}

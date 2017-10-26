package com.codility;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.codility.L2CyclicRotation;

public class L2CyclicRotationTest {

	L2CyclicRotation service;
	
	int A[] = {3,8,9,7,6};
	
	@Before
	public void setup() {
		service = new L2CyclicRotation();
	}
	
	//@Test
	public void test_zeroRotate() {
		int result[] = service.solution(A, 0);
		System.out.println(Arrays.toString(result));
	}
	
	@Test
	public void test_oneRotate() {
		int result[] = service.solution(A, 1);
		System.out.println(Arrays.toString(result));
	}
	@Test
	public void test_threeRotate() {
		int result[] = {9,7,6,3,8};
		assert(Arrays.equals(result,service.solution(A, 3)));
	}
}

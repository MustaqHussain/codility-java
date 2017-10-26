package com.codility;

import static org.junit.Assert.assertEquals;

public class L5PassingCars {

	public static void main(String arguments[]) {
		
		L5PassingCars service = new L5PassingCars(); 

		assertEquals(0,service.solution(new int[] {1,1}));
		assertEquals(0,service.solution(new int[] {1,0}));
		assertEquals(1,service.solution(new int[] {1,0,1}));
		
		assertEquals(0,service.solution(new int[] {0}));
		assertEquals(1,service.solution(new int[] {0,1}));
		assertEquals(0,service.solution(new int[] {0,0,0}));
		assertEquals(3,service.solution(new int[] {0,0,0,1}));
		assertEquals(3,service.solution(new int[] {0,1,1,1}));
		assertEquals(5,service.solution(new int[] {0,1,0,1,1}));

		assertEquals(3,service.solution(new int[] {1,0,0,0,1}));
		assertEquals(3,service.solution(new int[] {1,0,1,1,1}));
		assertEquals(5,service.solution(new int[] {1,1,1,1,0,1,0,1,1}));
		
		System.out.println("All Passed");
	}
	
	public int solution(int A[]) {
		
		// Number of passing cars
		int incBy = 0;
		int passes = 0;
		
		for (int i=0; i<A.length; i++) {
			if (A[i]==0) {
				incBy++;
			}
			
			if (A[i]==1) {
				passes+=incBy; 
			}
		}
		
		if ( passes > 1000000000) passes = -1;
		
		return passes;
	}
	
}

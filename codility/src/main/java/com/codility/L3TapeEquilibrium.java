package com.codility;

import static org.junit.Assert.assertEquals;

public class L3TapeEquilibrium {
	
	public static void main(String[] args) {
		L3TapeEquilibrium  a = new L3TapeEquilibrium();
		
		
		assertEquals(1,a.solution(new int[] { 3, 1, 2, 4, 3}));
		assertEquals(2,a.solution(new int[] { 3, 1}));
		assertEquals(1,a.solution(new int[] { -3, -1, -2, -4, -3}));
		assertEquals(2,a.solution(new int[] { -3, -1, -2, 4, 3}));
	
		System.out.println("Passed all test");
	}
	
	public int solution(int[] A) {
		
		if ( A.length == 2 ) {
	//		return Math.abs(A[0]-A[1]);
		}
		
		int min = Math.abs(A[0]-A[1]);
		for (int p=1; p<A.length; p++) {

			int add = 0;
			for ( int a=0; a<p; a++) {
				add+=A[a];
			}

			int sub = 0;
			for ( int a=p; a<A.length; a++) {
				sub+=A[a];
			}
			
			System.out.println(add + " - " + sub);
			//min = Math.abs(add-sub)<min? Math.abs(add-sub) : min;
			min = Math.min(Math.abs(add-sub), min);
		}
//		System.out.println(min);
		return min;
	}
}

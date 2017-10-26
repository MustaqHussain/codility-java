package com.codility;

import static org.junit.Assert.assertEquals;

public class L3PermMissingElem {
	
	public static void main(String arguments[]) {
		
		L3PermMissingElem m = new L3PermMissingElem();
		
		assertEquals(4, m.solution( new int[] {2,3,1,5}) );
		assertEquals(1, m.solution( new int[] {2}) );
		assertEquals(1, m.solution( new int[] {1}) );
		assertEquals(0, m.solution( new int[] {}) );
		System.out.println("Passed all test");
	}

	public int solution(int A[]) {
		int N = A.length;
		long maxTotal = N * (N+1)/2;
		
		for (int i=0; i<N; i++) {
			maxTotal -= i;
		}
		return (int)maxTotal;
	}
	
}

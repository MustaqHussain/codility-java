package com.codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class L8Dominator {
	
	public static void main(String arguments[]) {
		
		L8Dominator service = new L8Dominator();
		
		
		assertEquals(-1, service.solution(null));
		assertEquals(-1, service.solution(new int[] {}));
		assertEquals(0, service.solution(new int[] {4}));
		assertEquals(1, service.solution(new int[] {4,4}));
		assertEquals(1, service.solution(new int[] {4,4,4}));
		assertEquals(-1, service.solution(new int[] {4,6,6,6,8,8}));
		assertEquals(3, service.solution(new int[] {4,6,6,6,6,8,8}));
		assertEquals(0, service.solution(new int[] {2147483647}));

		
		
		System.out.println("L8Dominator: Passed all test");
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		if (A==null || A.length==0) return -1;
		
		Arrays.sort(A);
		int pos = A.length/2;		
		int count = 0;
		
		for (int i=0; i<A.length; i++) {
			if (A[i]==A[pos]) {
				count++;
			}
		}
		
		if (count>pos) {
			return pos;
		}
		
		return -1;
    }
}
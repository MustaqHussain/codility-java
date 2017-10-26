package com.codility;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

public class L4MissingInteger {

	static public void main(String arugents[]) {
		L4MissingInteger inst = new L4MissingInteger();
		
		assertEquals(5, inst.solution(new int[] {1,3,6,4,1,2}));
		assertEquals(1, inst.solution(new int[] {-1,-3}));
		assertEquals(3, inst.solution(new int[] {1,2,-3}));
		assertEquals(3, inst.solution(new int[] {-3,1,2,4}));
		assertEquals(2, inst.solution(new int[] {1}));
		assertEquals(2, inst.solution(new int[] {1,3}));
		assertEquals(1, inst.solution(new int[] {2}));
		
		System.out.println("Passed all test");
	}
	
	
	public int solution(int[] A) {
		
		Set<Integer> found = new HashSet<Integer>();
		
		for (int i=0; i<A.length; i++) {
			if (A[i]<=0) {
				continue;			
			}
			found.add(A[i]);
		}

		for (int i=1; i<=found.size()+1; i++) {
						
			if (found.contains(i)==false) {
				return i;
			}
		}

		return found.size();
	}
}

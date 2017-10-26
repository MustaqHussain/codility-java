package com.codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class Demo {
	
	public static void main(String arguments[]) {
		
		Demo service = new Demo();
		
		assertEquals(4, service.solution(new int[] {1,2,3}));
		assertEquals(1, service.solution(new int[] {0,2,3}));
		assertEquals(1, service.solution(new int[] {2,3}));
		assertEquals(1, service.solution(new int[] {-3}));
		assertEquals(1, service.solution(new int[] {2}));
		
		System.out.println("Passed all test");
	}
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		
		Arrays.sort(A);
		
		int smallest = 0;
		for(int i=0; i<A.length; i++) {
			if (A[i]<=0) continue;
			if (A[i]==smallest) continue;
			
			if (A[i]==smallest+1) {
				smallest=A[i];
				continue;
			} else {
				smallest++;
				break;				
			}			
		}
		if (A[A.length-1] == smallest ){
			smallest++;
		}
		if (smallest==0 ){
			smallest++;
		}		
		return smallest;
    }
}

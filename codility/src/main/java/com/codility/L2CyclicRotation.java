package com.codility;

public class L2CyclicRotation {

	public int[] solution(int[] A, int K) {
		if ( K == 0) return A;
		
		for (int num=0; num<K; num++) {
			int move = A[A.length-1];
			int current = A[0];
			for ( int i=0; i<A.length; i++) {
				current = A[i];
				A[i] = move;
				move = current;
			}
		}
		
		return A;
	}
}

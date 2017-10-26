package com.codility;

public class L5CountDiv {

	public int solution(int A, int B, int K) {
		
		int numIntegers = 0;
		for (int i=A; i<=B; i++) {
			if ((i % K)==0) {
				numIntegers++;
			}
		}
		
		return numIntegers;
	}
}

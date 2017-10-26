package com.codility;

import java.util.Arrays;

public class L6Distinct {

	public int solution(int[] A) {
				
		if (A==null) {
			return 0;
		}
		
		int length=A.length;
		int counter[] = new int[length];
		// Fill with MIN_VALUE because default 0 valid value for array
		Arrays.fill(counter, Integer.MIN_VALUE);

		int distinct = 0;
		for(int value : A) {
			
			// Keep track of unique values in counter
			for (int j=0; j<=distinct; j++) {
				// Add to counter if at end of counter
				if (counter[j]==Integer.MIN_VALUE) {
					counter[j]=value;
					distinct++;
					break;
				}
				// value already in counter
				if (counter[j]==value) {
					break;
				}
			}
		}
		
		return distinct;
	}
	
}

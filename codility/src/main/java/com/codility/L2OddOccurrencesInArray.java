package com.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L2OddOccurrencesInArray {
	
	public int solution(int[] A) {
		
		if (A.length==1) return A[0];
		
		List<Integer> pairs = new ArrayList<Integer>();
		
		int unPairedIndex = 0;
		for (int i=0; i<A.length; i++) {
			if ( pairs.contains(i) ) {
				continue;
			}
			
			boolean pairFound = false;
			for (int x=i+1; x<A.length; x++) {			
				if ( A[i]==A[x] ) {
					pairs.add(i);
					pairs.add(x);
					pairFound = true;
					break;
				}			
			}
			if (!pairFound) {
				unPairedIndex = i;
			}
		}

		// Quick way
		int missingInt = 0;
		for (int value: A) {
			missingInt = missingInt ^ value;
		}
		
		
		
		System.out.println(Arrays.toString(pairs.toArray()) + " unpaired value:" + A[unPairedIndex]);
		
		return A[unPairedIndex];
		//return missingInt;
	}
}

package com.codility;

public class L4FrogRiverOne {

	
	 public int solution(int X, int[] A) {
		 
		 int length = A.length;

		 // Defaults to zero
		 // Keep count of permutations
		 // Should all contain 1 
		 int counter[] = new int[X];
		 
		 int maxTime = 0;
		 for (int i=0; i<length; i++) {

			 // Check if one of the leafs needed
			 if (A[i]<=X) {
				 
				 if (counter[A[i]-1]==0) {
					 
					 counter[A[i]-1] = 1;

					 if (i>maxTime) {
						 maxTime = i;
					 }
				 }
			 }
		 }
		 
		 return maxTime;
	 }

}

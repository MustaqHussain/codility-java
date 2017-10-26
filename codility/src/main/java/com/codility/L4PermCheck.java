package com.codility;

public class L4PermCheck {

	public int solution(int[] A) {

		int length = A.length;

		// Defaults to zero
		// Keep count of permutations
		// Should all contain 1
		int counter[] = new int[length];

		for (int i = 0; i < length; i++) {
			if (A[i] > length) {
				return 0;
			}

			if (counter[A[i] - 1] == 0) {
				counter[A[i] - 1] = 1;
			} else {
				return 0;
			}
		}

		return 1;
	}
}

package com.codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class L6DistinctUsingSort {

	public static void main(String arguments[]) {
		L6Distinct service;

		int A[] = { 2, 1, 1, 2, 3, 1 };
		int B[] = { 2, 1, 1, 2, 2, 1 };
		int C[] = { 2, 1, 1, 0, 2, 1 };
		int D[] = { 3, 3, 3 };
		int E[] = {};

		service = new L6Distinct();

		assertEquals(3, service.solution(A));
		assertEquals(2, service.solution(B));
		assertEquals(3, service.solution(C));
		assertEquals(1, service.solution(D));
		assertEquals(0, service.solution(E));
		System.out.println("Pass all tests");
	}

	public int solution(int[] A) {

		if (A == null) {
			return 0;
		}

		Arrays.sort(A);

		int distinct = 0;
		for (int i = 0; i < A.length; i++) {

			// At start
			if (i == 0) {
				if (A[i] != A[i + 1]) {
					distinct++;
					continue;

				}
			}

			// At end
			if (i == A.length - 1) {
				if (A[i] != A[i - 1]) {
					distinct++;
					continue;
				}
			}

			// In middle
			if (A[i] != A[i - 1] && A[i] != A[i + 1]) {
				distinct++;
			}

		}

		return distinct;
	}

}

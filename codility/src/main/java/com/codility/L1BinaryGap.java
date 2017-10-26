package com.codility;

public class L1BinaryGap {
	
	public int solution(int N) {
		
		if ( N < 0 ) {
			System.out.println("Negative not allowed: " + N);
			throw new RuntimeException();
		}

		
		// Check if 0
		if ( N==0 ) return 0;
		
		String binaryString = Integer.toBinaryString(N);
		System.out.println(binaryString);
		
		int maxGap = 0;
		int localGap = 0;
		int binaryLength = binaryString.length();
		for (int i=0; i<binaryString.length(); i++ ) {
			
//			System.out.println(binaryString.charAt(i));
			
			// If at end of sequence and 0 found
			if (i==binaryLength-1 && binaryString.charAt(i) == '0') break;
			
			if (binaryString.charAt(i) == '1') {
				// New start of sequence
				// Check if largest sequence
				if (localGap>maxGap ) {
					maxGap = localGap;
					localGap = 0;
				}
			} else {
				localGap++;
			}
		}
		System.out.println(maxGap);
		
		return maxGap;
	}
	
}

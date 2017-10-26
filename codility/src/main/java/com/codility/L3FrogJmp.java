package com.codility;

import static org.junit.Assert.assertEquals;

public class L3FrogJmp {

	static public void main(String arguments[]) {
		
		L3FrogJmp in = new L3FrogJmp();
		assertEquals(3,in.solution(10, 85, 30) );
		assertEquals(0,in.solution(10, 10, 30) );
		assertEquals(1,in.solution(10, 20, 30) );
		
		System.out.println("All test passed");
	}
	
	public int solution(int X, int Y, int D) {
		
		int jumps = (int)Math.ceil((double)(Y-X)/D);
		return jumps;
	}
	
}

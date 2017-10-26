package com.codility;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

public class L7Nesting {

	public static void main(String arguments[]) {
		
		L7Nesting service = new L7Nesting();
		
		assertEquals(1, service.solution("(()(())())"));
		assertEquals(0, service.solution("())"));
		assertEquals(1, service.solution("()"));
		assertEquals(1, service.solution(""));
		assertEquals(0, service.solution("("));
		assertEquals(0, service.solution(")"));
		
		System.out.println("L8Nesting: Passed all test");
	}
	
	public int solution(String S) {
		
		
		if (S.isEmpty()) return 1;

		int numOpening = 0;
		
		for (int i=0; i<S.length(); i++) {
			if (S.charAt(i)=='(' ) { 
				numOpening++;
				continue;
			}
			
			// a next character ')' so match with '('			
			if(numOpening==0) return 0;
			numOpening--;
		}
		
		return numOpening==0?1:0;
	}

	
	public int solution_Strack(String S) {
		
		Stack<Character> stack = new Stack<Character>();
		
		if (S.isEmpty()) return 1;
		
		for (int i=0; i<S.length(); i++) {
			if (S.charAt(i)=='(') { 
				stack.push('(');
				continue;
			}
			
			// a next character ')' so match with '('			
			if(stack.isEmpty()) return 0;
			if (stack.pop()=='(') continue;
		}
		
		return stack.isEmpty()?1:0;
	}
	
}

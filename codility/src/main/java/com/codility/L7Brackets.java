package com.codility;

public class L7Brackets {

	public int solution(String S) {
		
		if (S.isEmpty()) return 1;
		
		String queue = "";
		for (int i=0; i<S.length(); i++) {
			if ( openingBracket(S.charAt(i))) {
				// Ok
				queue += S.charAt(i);
			} else if ( machingClosingBracket(S.charAt(i), queue.charAt(queue.length()-1) ) ) {
				// Well formed
				queue = queue.substring(0, queue.length()-1);
			} else {
				// Not Well formed
				return 0;
			}
		}
		return queue.length()==0? 1 : 0;
	}

	private boolean openingBracket(char a) {
		if (a=='[' || a =='{' || a=='(') {
			return true;
		}
		return false;
	}
	
	
	private boolean machingClosingBracket(char a, char q) {
		if (a==')' && q=='(' ) {
			return true;
		}
		if (a==']' && q=='[' ) {
			return true;
		}
		if (a=='}' && q=='{' ) {
			return true;
		}
		return false;
	}
}

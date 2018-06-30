package com.br.djavanigomes;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
			
	}	

	public int hasBalancedBrackets(String str) {
		Stack<Character> brackets = new Stack<Character>();
		if (str == null || str.isEmpty()) {
			return 1;
		} else {			
			for (int i = 0; i < str.length(); i++) {
				if (isOpeningBracket(str.charAt(i))) {
					brackets.push(str.charAt(i));
				} else if (isClosingBracket(str.charAt(i))){
					if (brackets.isEmpty()) {						
						return 0; 
					}
					if (brackets.pop() != matchingOpeningBracket(str.charAt(i))) {						
						return 0;
					}
				}
			}			
			return (brackets.isEmpty() ? 1 : 0);
		}
	}

	private boolean isOpeningBracket(char c) {
		switch (c) {
			case '(': return true;
			case '{': return true;
			case '[': return true;
			case '<': return true;
		}
		return false;
	}
	
	private boolean isClosingBracket(char c) {
		switch (c) {
			case ')': return true;
			case '}': return true;
			case ']': return true;
			case '>': return true;
		}
		return false;
	}
	
	private char matchingOpeningBracket(char c) {
		switch (c) {
			case ')': return '(';
			case '}': return '{';
			case ']': return '[';
			case '>': return '<';
		}
		return '\0';
	}
}

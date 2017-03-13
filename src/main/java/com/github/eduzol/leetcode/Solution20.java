package com.github.eduzol.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution20 {

	/**
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
	 * determine if the input string is valid.
	 * The brackets must close in the correct order, "()" and "()[]{}" are all valid 
	 * but "(]" and "([)]" are not.
	 */
	public boolean isValid(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		List<Character>  targets = Arrays.asList(new Character[]{'(',')','[',']','{','}'});
		
		for ( int i = 0 ; i < s.length() ; i++){

			Character element = s.charAt(i);
			if (!targets.contains(element)){
				continue;
			}
			
			boolean isOpenCharacter = element.equals('(') || element.equals('{') || element.equals('[');
			
			boolean isValidClosingParenthesis = element.equals(')') && !stack.isEmpty() && stack.peek()=='(' ;
			
			boolean isValidClosingSquares = element.equals(']') && !stack.isEmpty() &&  stack.peek()=='[' ;
			
			boolean isValidClosingBrackets = element.equals('}')&& !stack.isEmpty() &&  stack.peek()=='{' ;
			
			if ( isOpenCharacter ){
				stack.push(element);
			}else if (isValidClosingParenthesis ){
				stack.pop();
			}else if(isValidClosingSquares ){
				stack.pop();
			}else if(isValidClosingBrackets){
				stack.pop();
			}else {
				return false;
			}
			
		}
		
		return stack.isEmpty();
	}
	 
}

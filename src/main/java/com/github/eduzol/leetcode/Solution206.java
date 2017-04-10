package com.github.eduzol.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution206 {

	/**
	 * Reverse a singly linked list.
	 * A linked list can be reversed either iteratively or recursively. Could you implement both?
	 */
	
	 public ListNode reverseList(ListNode head) {
		 
		 Deque<Integer> stack = new LinkedList<Integer>();
		 ListNode current =  head;
		 
		 while ( current != null ){
			 stack.push(current.val);
			 current = current.next;
		 }
		 
		 current = head;
		 while(!stack.isEmpty() ){
			 
			 current.val = stack.pop();
			 current =  current.next;
		 }
		 return head;
	 }
	 
	 public class ListNode {
			
			int val;
			ListNode next;
			ListNode(int x) { val = x; }
			
			@Override
			public String toString() {
				return "ListNode [val=" + val + "]";
			}
			
		}
}

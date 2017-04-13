package com.github.eduzol.leetcode;

public class Solution141 {

	/**
	 * Given a linked list, determine if it has a cycle in it.
	 * Follow up: Can you solve it without using extra space?
	 */
	
	
	
	public boolean hasCycle(ListNode head) {
        /**
         * 	Floyd’s Cycle-Finding Algorithm:
         *  This is the fastest method. 
         *  Traverse linked list using two pointers.  
         *  Move one pointer by one and other pointer by two.  
         *  If these pointers meet at some node then there is a loop.  
         *  If pointers do not meet then linked list doesn’t have loop.
         */
		if ( head == null ){
			return false;
		}
		
		ListNode slow = head;
		ListNode fast = head;
		
		while ( slow != null  && fast != null && fast.next != null){
			
			slow = slow.next;
			fast = fast.next.next;
			
			if ( slow == fast ){
				return true;
			}
		}
		
		return false;
		
    }
	
	
	
	 class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	 }
	 
	
}

package com.github.eduzol.leetcode;

public class Solution21 {

	/**
	 * Merge two sorted linked lists and return it as a new list. 
	 * The new list should be made by splicing together the nodes of the first two lists.
	 */
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    
		if ( l1 == null && l2 ==null){
			return null;
		}
		
		if ( l1 == null){
			return l2;
		}
		
		if (l2 == null){
			return l1;
		}
		
		
		ListNode head = new ListNode(0);
		ListNode pointerToHead = head;
		while (true){
			
			if ( l1 == null ){
				head.next = l2;
				break;
			}
			
			if (l2 == null){
				head.next = l1;
				break;
			}
			
			if ( l1.val <= l2.val ){
				head.next= l1;
				l1 = l1.next;
			}else{
				head.next= l2;
				l2 = l2.next;
			}
			
			head = head.next;
		}
		
		return pointerToHead.next;
    }
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
		
		@Override
		public String toString() {
			return "ListNode [val=" + val + ", next=" + next + "]";
		}
		
		
	}
}

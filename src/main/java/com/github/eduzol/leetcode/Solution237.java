package com.github.eduzol.leetcode;

public class Solution237 {

	/**
	 * Since we couldn't enter the preceding node, we can not delete the given node. 
	 * We can just copy the next node to the given node and delete the next one.
	 * @param node
	 */
	public void deleteNode(ListNode node) {
        
		node.val = node.next.val;
		node.next = node.next.next;
		
        
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

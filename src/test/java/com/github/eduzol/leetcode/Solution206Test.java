package com.github.eduzol.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution206Test {

	@Test
	public void test(){
		
		
		Solution206 solution = new Solution206();
		Solution206.ListNode head  = solution.new ListNode(1);
		
		Solution206.ListNode node1  = solution.new ListNode(2);
		
		Solution206.ListNode node2  = solution.new ListNode(3);
		
		head.next = node1;
		node1.next = node2;
		
		printNode(head);
		
		Solution206.ListNode reversed  = solution.reverseList(head);
		
		printNode(reversed);
		
		Assert.assertEquals(true, true);
	}


	@Test
	public void test2(){
		
		
		Solution206 solution = new Solution206();
		Solution206.ListNode head  = solution.new ListNode(1);
		
		printNode(head);
		
		Solution206.ListNode reversed  = solution.reverseList(head);
		
		printNode(reversed);
		
		Assert.assertEquals(true, true);
	}
	
	
	void printNode( Solution206.ListNode head){
		
		Solution206.ListNode nav = head;
		StringBuilder builder = new StringBuilder();
		
		while ( nav != null  ){
			builder.append(nav+"->");
			nav = nav.next;
		}
		System.out.println(builder);
	}
}


package com.github.eduzol.leetcode;

import org.junit.Assert;
import org.junit.Test;

import com.github.eduzol.leetcode.Solution21.ListNode;

public class Solution21Test {

	@Test
	public void test1(){
		
		Solution21 solution = new Solution21();
		ListNode nodeA = solution.new ListNode(2);
		ListNode nodeB = solution.new ListNode(1);
		
		ListNode merged = solution.mergeTwoLists(nodeA, nodeB);
		
		Assert.assertEquals(merged.val, 1);
		Assert.assertEquals(merged.next.val, 2);
		
		
		
	}
	
	
	@Test
	public void test2(){
		
		Solution21 solution = new Solution21();
		ListNode nodeA = solution.new ListNode(2);
		ListNode nodeB = solution.new ListNode(5);
		
		nodeA.next =  solution.new ListNode(3);
		nodeB.next = solution.new ListNode(15);
		
		ListNode merged = solution.mergeTwoLists(nodeA, nodeB);
		
		Assert.assertEquals(merged.val, 2);
		Assert.assertEquals(merged.next.val, 3);
		Assert.assertEquals(merged.next.next.val, 5);
		Assert.assertEquals(merged.next.next.next.val, 15);
			
	}
}

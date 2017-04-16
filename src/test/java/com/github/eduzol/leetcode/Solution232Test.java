package com.github.eduzol.leetcode;

import org.junit.Assert;
import org.junit.Test;


import com.github.eduzol.leetcode.Solution232.MyQueue;

public class Solution232Test {

	@Test
	public void test(){
		
		Solution232 solution = new Solution232();
		
		MyQueue obj =solution.new MyQueue();
		obj.push(5);
		
		int param_3 = obj.peek();
		Assert.assertEquals(param_3, 5);
		
		obj.push(10);
		
		int param_2 = obj.pop();
		Assert.assertEquals(param_2, 5);
		
		boolean param_4 = obj.empty();
		Assert.assertEquals(param_4,false);
	 
		
	}
	
	
}

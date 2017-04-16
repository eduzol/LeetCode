package com.github.eduzol.leetcode;

import org.junit.Assert;
import org.junit.Test;

import com.github.eduzol.leetcode.Solution255.MyStack;



public class Solution255Test {

	@Test
	public void test(){
		
		Solution255 solution = new Solution255();
		MyStack obj = solution.new MyStack();
		obj.push(3);
		int param_2 = obj.pop();
		
		Assert.assertEquals(param_2, 3);
		
		boolean param_4 = obj.empty();
		Assert.assertEquals(param_4,true);
	}
	
	@Test
	public void test2(){
		
		Solution255 solution = new Solution255();
		MyStack obj = solution.new MyStack();
		obj.push(3);
		obj.push(5);
		obj.push(7);
		int param_2 = obj.pop();
		
		Assert.assertEquals(param_2, 7);
		
		int param_4 = obj.top();
		Assert.assertEquals(param_4,5);
	}
}

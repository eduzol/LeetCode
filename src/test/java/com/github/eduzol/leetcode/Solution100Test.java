package com.github.eduzol.leetcode;
import org.junit.Assert;
import org.junit.Test;

public class Solution100Test {

	@Test
	public void test(){
		
		Solution100 solution = new Solution100();
		
		boolean areSame = solution.isSameTree(null, null);
		
		Assert.assertTrue(areSame);
	}
	
}

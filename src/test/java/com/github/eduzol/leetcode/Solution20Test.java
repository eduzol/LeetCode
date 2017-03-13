package com.github.eduzol.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution20Test {

	@Test
	public void test(){
		
		String validStr = "((( { 45} )))";
		String invalidStr = "))4a(){}";
		
		boolean isValid = new Solution20().isValid(validStr);
		Assert.assertEquals(isValid, true);
		
		isValid = new Solution20().isValid(invalidStr);
		Assert.assertEquals(isValid, false);
	}
}

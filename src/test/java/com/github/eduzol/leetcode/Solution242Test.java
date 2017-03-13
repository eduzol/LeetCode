package com.github.eduzol.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution242Test {

	@Test
	public void test(){
		
		String s = "HAAMLET";
		String t = "AAMLETH";
		
		Solution242 solution = new Solution242();
		boolean isAnagram = solution.isAnagram(s, t);
		System.out.println(s + " is anagram of " + t + " ? " + isAnagram);
		Assert.assertEquals(isAnagram, true);
	
	}
}

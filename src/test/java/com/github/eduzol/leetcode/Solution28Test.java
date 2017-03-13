package com.github.eduzol.leetcode;

import org.junit.Test;

import org.junit.Assert;

public class Solution28Test {

	@Test
	public void test(){
		
		String haystach = "qwqwqwqa";
		String needle = "a";
		
		Solution28 solution = new Solution28();
		int index =  solution.strStr(haystach, needle);
		System.out.println("Index " + index);
		Assert.assertEquals(index,7);
	}
}

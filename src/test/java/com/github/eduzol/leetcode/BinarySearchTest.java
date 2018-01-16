package com.github.eduzol.leetcode;

import org.junit.Test;

import com.github.eduzol.algol.search.BinarySearcher;

import org.junit.Assert;

public class BinarySearchTest {

	@Test
	public void test() {
		
		int[] elements = new int[]{3,7,4,6,0,1,2,3,9,5,23,8};
		
		int found = BinarySearcher.search(elements, 9);
		Assert.assertTrue(found>0);
		Assert.assertTrue(elements[found] == 9);
	}
}

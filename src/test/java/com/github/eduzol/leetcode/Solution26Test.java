package com.github.eduzol.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution26Test {

	@Test
	public void test(){
		
		Solution26 solution = new Solution26();
		int[] nums = new int[]{1,2,3,7,5,6,7,4,8,8,9,12,11,10,6};
		
		int newLength = solution.removeDuplicates(nums);
		System.out.println("New length " +newLength );
		
		for ( int i = 0 ; i < newLength; i++){
			System.out.println(nums[i]);
		}
		
		Assert.assertEquals(newLength, 12);
	}
}

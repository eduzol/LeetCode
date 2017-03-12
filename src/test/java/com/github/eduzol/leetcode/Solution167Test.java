package com.github.eduzol.leetcode;

import org.junit.Test;

import org.junit.Assert;

public class Solution167Test {

	
	@Test
	public void test(){

		/**
		 * Input: numbers={2, 7, 11, 15}, target=9
		 * Output: index1=1, index2=2
		 * Input:[1,2,3,4,4,9,56,90]
		 * 8
		 */
		
		//int[] numbers  = new int[]{1,2,3,4,4,9,56,90};
		//int target = 8;
		
		//int[] numbers  = new int[]{2,7,11,15};
		//int target = 9;

		
		int[] numbers  = new int[]{2,3,4};
		int target = 6;

		Solution167 solution = new Solution167();
		int[] indices  = solution.twoSum(numbers, target);
		
		System.out.println("Indices found " + indices[0] + " , " + indices[1] );
		
		int i = indices[0]-1;
		int j = indices[1]-1;
		
		System.out.println("i = " +numbers[i] + " + j = " + numbers[j] + " = " +( numbers[i]+numbers[j]) );
		Assert.assertEquals(numbers[i],2);
		Assert.assertEquals(numbers[j],4);
		Assert.assertEquals(numbers[i]+numbers[j],6);
	}
}

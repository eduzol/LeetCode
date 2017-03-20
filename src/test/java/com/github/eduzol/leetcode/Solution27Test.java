package com.github.eduzol.leetcode;
import java.util.Arrays;

import org.junit.Test;
import org.junit.Assert;

public class Solution27Test {

	
	@Test
	public void test(){
		
		 int[] nums = new int[]{3,2,2,3};
         int val = 3;
         Solution27 main = new Solution27();
         int newLength = main.removeElement(nums, val);
         System.out.println("newLength " + newLength );
         System.out.println("Array=> " + Arrays.toString(nums));
         
         Assert.assertEquals(nums[0],2);
         Assert.assertEquals(nums[1],2);
	}
}

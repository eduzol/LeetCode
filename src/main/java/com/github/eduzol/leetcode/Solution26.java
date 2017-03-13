package com.github.eduzol.leetcode;

import java.util.Arrays;

public class Solution26 {

	/**
	 * Given a sorted array, remove the duplicates in place such that each element appears only once 
	 * and return the new length.
	 * Do not allocate extra space for another array, 
	 * you must do this in place with constant memory.
	 */
	public int removeDuplicates(int[] nums) {
		
		int i = 1 ;//write index
		int j = 0;
		int k = 1;
		
		//Sort array
		Arrays.sort(nums);
		
		while( k < nums.length ){
			if ( nums[j] != nums[k] ){
				nums[i] = nums[k];
				i++;
			}
			j++;
			k++;
		}
		
        return i;
    }

}

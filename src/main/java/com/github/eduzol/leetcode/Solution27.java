package com.github.eduzol.leetcode;

public class Solution27 {

	 /**
	  * Given an array and a value, remove all instances of that value in place and return the new length.
	  * Do not allocate extra space for another array, you must do this in place with constant memory.
	  * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
	  * Example:
	  * Given input array nums = [3,2,2,3], val = 3
	  * Your function should return length = 2, with the first two elements of nums being 2.
	  */
	//Complexity O(n)
    public int removeElement(int[] nums, int val) {
        
        int newLength =  0;
        
        for ( int i = 0  ; i < nums.length ; i++  ){
            int value = nums[i];
            if ( value != val ){
                nums[newLength] = value;
                newLength++; 
            }
        }
        return newLength;
    }
}

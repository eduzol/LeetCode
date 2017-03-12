package com.github.eduzol.leetcode;

public class Solution167 {

	/**
	 * Given an array of integers that is already sorted in ascending order, 
	 * find two numbers such that they add up to a specific target number.
	 * The function twoSum should return indices of the two numbers such that they add up to the target,
	 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2) 
	 * are not zero-based.
	 * @param args
	 */
	public int[] twoSum(int[] numbers, int target) {
    	
		
		for ( int i = 0 ;  i < numbers.length ; i++){
			
			int pair  = target - numbers[i];
			int j = 0;
			int k = numbers.length-1;
			//binary search for pair
			while(j <= k){
				
				int mid = j+ (k-j)/2;
				
				if ( i == mid){
					break;
				}
				
				if ( numbers[mid] == pair ){
					
					if (i<mid ){
						int[] indices = new int[]{i+1, mid+1};
						return indices;
					}else{
						int[] indices = new int[]{mid+1, i+1};
						return indices;
						
					}
				}
				
				if ( numbers[mid] < pair){
					j = mid +1;
				}else{
					k= mid-1;
				}
			}
			
		}
		
		return null;
    }

}

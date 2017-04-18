package com.github.eduzol.leetcode;
import org.junit.Assert;
import org.junit.Test;

import com.github.eduzol.algol.sort.MergeSorter;

public class MergeSortTest {

	
	@Test
	public void test(){
		
		int[] elements = new int[]{3,7,4,6,0,1,2,3,9,5,23,8};
		
		MergeSorter sorter =  new MergeSorter();
		sorter.sort(elements);
		
		for ( int i  = 0 ; i < ( elements.length-1 ) ; i++ ){
			Assert.assertTrue(elements[i] <= elements[(i+1)]);
		}
		
	}
}

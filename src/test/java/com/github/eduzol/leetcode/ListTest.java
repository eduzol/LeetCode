package com.github.eduzol.leetcode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.github.eduzol.algol.linkedlist.ListUtilities;


public class ListTest {

	
	@Test
	public void BinarySearchTest(){
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(9);
		list.add(12);
		list.add(17);
		list.add(25);
		
		Integer target  = 17;
		Integer index = new ListUtilities().binarySearch(list, target);
		System.out.println( list.get(index) );
		Assert.assertEquals(new Integer(target), list.get(index));
		
	}
}

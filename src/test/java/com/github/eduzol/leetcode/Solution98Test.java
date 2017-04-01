package com.github.eduzol.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Solution98Test {

	@Test
	public void test(){
		
		Solution98 solution = new Solution98();
		
		Solution98.TreeNode tree = solution.new TreeNode(50);
		tree.left = solution.new TreeNode(25);
		tree.right =  solution.new TreeNode(75);
		tree.left.left = solution.new TreeNode(5);
		boolean isValid = solution.isValidBST(tree);
		System.out.println("isValid " + isValid);
		
		Assert.assertTrue(isValid);
		
	}
	
	@Test
	public void test2(){
		
		Solution98 solution = new Solution98();
		
		Solution98.TreeNode tree = solution.new TreeNode(1);
		tree.left = solution.new TreeNode(1);
		boolean isValid = solution.isValidBST(tree);
		System.out.println("isValid " + isValid);
		
		Assert.assertFalse(isValid);
		
	}
	
	
}

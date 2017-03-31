package com.github.eduzol.leetcode;

import org.junit.Test;
import org.junit.Assert;

public class Solution112Test {

	@Test
	public void test(){
		
		
		Solution112 solution = new Solution112();
		Solution112.TreeNode tree =  solution.new TreeNode(1);
		
		boolean hasSum =  solution.hasPathSum(tree, 1);
		Assert.assertTrue(hasSum);
		
	}
	
	@Test
	public void test2(){
		
		Solution112 solution = new Solution112();
		Solution112.TreeNode tree =  solution.new TreeNode(1);
		tree.left= solution.new TreeNode(2);
		
		boolean hasSum =  solution.hasPathSum(tree, 2);
		Assert.assertFalse(hasSum);
		
	}
	
	@Test
	public void test3(){
		
		Solution112 solution = new Solution112();
		Solution112.TreeNode tree =  solution.new TreeNode(1);
		tree.left= solution.new TreeNode(2);
		
		boolean hasSum =  solution.hasPathSum(tree, 1);
		Assert.assertFalse(hasSum);
	}
	
}

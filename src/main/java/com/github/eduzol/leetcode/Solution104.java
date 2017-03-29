package com.github.eduzol.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution104 {
	
	/**
	 * Given a binary tree, find its maximum depth.
	 * The maximum depth is the number of nodes along the longest path 
	 * from the root node down to the farthest leaf node.
	 * 
	 */
	public int maxDepth(TreeNode root) {
       
		if ( root == null ){
			return 0;
		}

		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		Deque<Integer> count = new LinkedList<Integer>();
		
		stack.push(root);
		count.push(1);
		int max  = 0;
		
		while( !stack.isEmpty() ){
			
			TreeNode current = stack.pop();
			int value = count.pop();
			
			if ( current.right != null ){
				stack.push(current.right);
				count.push(value +1);
			}
			
			if (current.left != null ){
				stack.push(current.left);
				count.push(value+1);
			}
			
			max = Math.max(max,  value);
		}
		
		return max;
		
    }
	
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	 
	 
	 

}

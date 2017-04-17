package com.github.eduzol.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution102 {

	/**
	 * Given a binary tree, return the level order traversal of its nodes' values. 
	 * (ie, from left to right, level by level).

		For example:
		Given binary tree [3,9,20,null,null,15,7],
		    3
		   / \
		  9  20
		    /  \
		   15   7
		return its level order traversal as:
		[
		  [3],
		  [9,20],
		  [15,7]
		]
	 */
	
	
	public List<List<Integer>> levelOrder(TreeNode root) {
        
		List<List<Integer>> levels = new ArrayList<List<Integer>>();
		if (root == null){
			return levels;
		}
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			List<Integer> level = new ArrayList<Integer>();
			int size =  queue.size();
			
			for ( int i = 0 ; i < size ; i++ ){
				
				TreeNode current = queue.poll();
				level.add(current.val);
				
				if ( current.left != null) {
					queue.add(current.left);
				}
				
				if ( current.right != null){
					queue.add(current.right);
				}
			}
			
			levels.add(level);
		}
		
		
		return levels;
    }
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}

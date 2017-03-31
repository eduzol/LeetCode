package com.github.eduzol.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution112 {

	
	/**
	 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values 
	 * along the path equals the given sum. 
	 * For example:
	 * Given the below binary tree and sum = 22
	 *    	  5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
      
      return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
	 */
	
	public boolean hasPathSum(TreeNode root, int sum) {
		
		if ( root == null ){
			return false;
		}
		
		if (root.left == null && root.right == null){
			return root.val == sum;
		}
		
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		Deque<List<Integer>> sumationStack = new LinkedList<List<Integer>>();
		
		List<Integer> numPaths  = new ArrayList<Integer>();
		
		sumationStack.push(numPaths);
		stack.push(root);
		
		while ( !stack.isEmpty() ){
			
			TreeNode node = stack.pop();
			List<Integer> values  = sumationStack.pop();
			
			if ( node.right != null ) {
				
				stack.push(node.right);
				List<Integer> vals = new ArrayList<Integer>();
				vals.addAll(values);
				vals.add(node.val);
				sumationStack.push(vals);
			}
			
			if (node.left != null){
				
				stack.push(node.left);
				List<Integer> vals = new ArrayList<Integer>();
				vals.addAll(values);
				vals.add(node.val);
				sumationStack.push(vals);
			}
			
			if ( node.left == null && node.right == null){
				
				Integer pathSum = node.val;
				for ( Integer element : values){
					pathSum += element;
				}
				
				if ( pathSum == sum){
					return true;
				}
			}
		}
		
		return false;
		
    }
	
	/**
	 * Definition for a binary tree node.
	 * */
	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
		@Override
		public String toString() {
			return "TreeNode [val=" + val + "]";
		}
		
	     	
	     
	 }
}

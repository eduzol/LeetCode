package com.github.eduzol.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution98 {

	/**
	 * Given a binary tree, determine if it is a valid binary search tree (BST).
	 * Assume a BST is defined as follows:
	 * The left subtree of a node contains only nodes with keys less than the node's key.
	 * The right subtree of a node contains only nodes with keys greater than the node's key.
	 * Both the left and right subtrees must also be binary search trees.
	 */
	
	public boolean isValidBST(TreeNode root) {
    	
		if ( root == null ){
			return true;
		}
		
		Deque<TreeNode> stack  = new LinkedList<TreeNode>();
		List<Integer> vals =  new ArrayList<Integer>();
		
		TreeNode current = root;
		
		while ( !stack.isEmpty() || current != null  ){
			
			while( current != null ){
				stack.push(current);
				current = current.left;
			}
			
			current = stack.pop();
			vals.add(current.val);
			current = current.right;
		}
		
		
		for( int i = 0 ;  i < ( vals.size() -1 ) ; i++){
			
			if (  vals.get(i) >= vals.get(i+1)){
				return false;
			}
		}
		
		
		return true;
    }
	
	
	
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

package com.github.eduzol.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution257 {

	
	/**
	 * Given a binary tree, return all root-to-leaf paths.
	 * For example, given the following binary tree:

		   1
		 /   \
		2     3
		 \
		  5
  		All root-to-leaf paths are:

		["1->2->5", "1->3"]
	 */
	
	/**
	 * Definition for a binary tree node.
	 */ 
	 
	
	public List<String> binaryTreePaths(TreeNode root) {
        
		List<String> paths = new ArrayList<String>();
		
		if ( root == null ){
			return paths;
		}
		
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		stack.push(root);
		Deque<String> pathStack  = new LinkedList<String>();
		
		while (!stack.isEmpty()){
			
			TreeNode node =  stack.pop();
			String path = pathStack.isEmpty() ? "":pathStack.pop();
			
			if ( node.right != null ){
				stack.push(node.right);
				pathStack.push(path+node.val+"->");
			}
			
			if(node.left != null ){
				stack.push(node.left );
				pathStack.push(path+node.val+"->");
			}
			
			if ( node.left == null && node.right == null ){
				paths.add(path+node.val);
			}
		}
		
		return paths;
    }
	
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	 
}

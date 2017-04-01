package com.github.eduzol.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution100 {

	
	public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if (  p == null && q!= null){
            return false;
        }
        
        if( p!= null && q == null){
            return false;
        }
        
        if ( p == null && q == null){
        	return true;
        }
        
        Deque<TreeNode> stackP = new LinkedList<TreeNode>();
        Deque<TreeNode> stackQ = new LinkedList<TreeNode>();
        
        stackP.push(p);
        stackQ.push(q);
        
        while(!stackP.isEmpty()){
            
            
            TreeNode currentP = stackP.pop();
            TreeNode currentQ = stackQ.pop();
            
            if ( currentP.val != currentQ.val){
                return false;
            }
            
            if (currentP.right != null ){
                stackP.push(currentP.right);
            }
            if (currentQ.right != null ){
                stackQ.push(currentQ.right);
            }

            if (stackP.size() != stackQ.size() ){
            	return false;
            }
            
            
            if (currentP.left != null ){
                stackP.push(currentP.left);
            }
            if (currentQ.left != null ){
                stackQ.push(currentQ.left);
            }

            if (stackP.size() != stackQ.size() ){
            	return false;
            }
            
        }
        
        return stackP.size() == stackQ.size();
        
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

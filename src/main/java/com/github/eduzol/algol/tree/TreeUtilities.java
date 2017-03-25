package com.github.eduzol.algol.tree;

import java.util.Deque;
import java.util.LinkedList;

public class TreeUtilities {

	/**
	 * Non recursive Deep first search
	 * @param tree
	 * @param target
	 * @return
	 */
	public Node search( Tree tree,int key ){
		
		Node root =tree.getRoot();
		if ( root == null ){
			return null;
		}
		
		Deque<Node> stack = new LinkedList<Node>();
		stack.push(root);
		
		while (!stack.isEmpty()) {
			
			Node node =  stack.pop();
			System.out.println("Node " + node );
			if ( node.rightChild != null ){
				stack.push(node.rightChild);
			}
			
			if(node.leftChild != null ){
				stack.push(node.leftChild );
			}
			
			if ( node.value.getKey() == key ){
				System.out.println("Found node "+ node );
				return node;
			}
		}
		return null;
	}
}

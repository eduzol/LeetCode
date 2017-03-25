package com.github.eduzol.algol.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

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
	
	public List<String> getBinarySearchTreePaths( Tree tree ){
		
		List<String> paths  = new ArrayList<String>();
		Node root = tree.getRoot();
		
		if ( root == null ){
			return paths;
		}
		
		Deque<Node> stack = new LinkedList<Node>();
		stack.push(root);
		Deque<String> pathStack  = new LinkedList<String>();
		
		while (!stack.isEmpty()){
			
			Node node =  stack.pop();
			String path = pathStack.isEmpty() ? "":pathStack.pop();
			
			if ( node.rightChild != null ){
				stack.push(node.rightChild);
				pathStack.push(path+node.getValue().getKey()+"->");
			}
			
			if(node.leftChild != null ){
				stack.push(node.leftChild );
				pathStack.push(path+node.getValue().getKey()+"->");
			}
			
			if ( isLeafNode(node) ){
				paths.add(path+node.getValue().getKey());
			}
		}
		
		return paths;
	}
	
	public boolean isLeafNode(Node node){
		
		if ( node.leftChild == null && node.rightChild == null){
			return true;
		}else{
			return false;
		}
	}
}

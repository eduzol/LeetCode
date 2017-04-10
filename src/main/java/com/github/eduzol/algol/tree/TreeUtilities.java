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
	
	public int getMaxDepth( Tree tree ) {
		
		if ( tree == null ){
			return 0;
		}
		
		Node root = tree.getRoot();
		
		if ( root == null){
			return 0;
		}
		
		Deque<Node> stack = new LinkedList<Node>();
		stack.push(root);
		Deque<Integer> count  = new LinkedList<Integer>();
		count.push(1);
		int max = 0;
		
		while (!stack.isEmpty()) {
			
			Node current = stack.pop();
			Integer value = count.pop();
			
			if ( current.rightChild != null ){
				stack.push(current.rightChild);
				count.push(value+1);
			}
			
			if (current.leftChild != null ){
				stack.push(current.leftChild);
				count.push(value+1);
			}
			
			max = Math.max( value , max );
			
		}
		
		return max;
		
	}
	
	public boolean isLeafNode(Node node){
		
		if ( node.leftChild == null && node.rightChild == null){
			return true;
		}else{
			return false;
		}
	}
	
	public List<Double> inOrderTraversal(Node node){
		
		List<Double> result = new ArrayList<Double>();
		
		if ( node == null ){
			return result;
		}
		
		Deque<Node> stack = new LinkedList<Node>();
		Node current  = node;
		
		while ( !stack.isEmpty() || current != null ) {
			
			while(  current != null ){
				stack.push(current);
				current = current.leftChild;
			}
			
			current = stack.pop();
			result.add(current.value.getValue());
			current = current.rightChild;
		}
		
		return result;
		
	}
}

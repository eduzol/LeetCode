package com.github.eduzol.algol.tree;

public class Tree {

	private Node root;
	
	public Node getRoot() {
		return root;
	}

	public Node find(int key){
		
		Node current = this.root;
		
		while ( current.value.key != key ){
			
			if ( key >  current.value.key ){
				current = current.rightChild;
			}else{
				current = current.leftChild;
			}
			
			if ( current == null ){
				return null;
			}
			
		}
		
		return current;
	}
	
	public void insert(int key , double value){
		
		Node node = new Node(key, value);
		
		if ( root == null ){
			root = node;
			return;
			
		}else{
			
			Node current = root;
			
			while(true){
				
				Node parent = current;
			
				if ( key > current.value.key ) {
				
					current = current.rightChild;
					if ( current == null  ){
						parent.rightChild= node;
						return;
					}
					
				}else{
					
					current = current.leftChild;
					if ( current == null){
						parent.leftChild= node;
						return;
					}
				}
			}
		}
	}
	
	private void inOrderTraversal(Node node){
		
		if ( node != null ){
			 inOrderTraversal(node.leftChild);
			 System.out.println(node);
			 inOrderTraversal(node.rightChild);
		}
		
	}
	
	public void displayTree(){
		inOrderTraversal(root);
	}
	
	
	public boolean delete(int key  ){
		
		/**
		 * First Part, find the node, add leftchild marker
		 */
		
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		
		while ( current.value.key != key ){
			
			parent = current;
			
			if ( key < current.value.key ){
				//go left
				isLeftChild = true;
				current = current.leftChild;
							
			}else{
				//go right
				isLeftChild = false;
				current = current.rightChild;
				
			}
		
			if ( current == null ){
				return false;
			}
			
		}
		
		/**
		 * First case, node is a leaf , node has no children
		 */
		
		if ( current.leftChild == null && current.rightChild == null){
			
			if ( current == root){
				root = null;
			}else if ( isLeftChild ){
				parent.leftChild = null;
			}else{
				parent.rightChild = null;
			}
			return true;
		}
		
		/**
		 * Second case, node has only one children  
		 */
		
		if ( current.leftChild == null  && current.rightChild != null  ){
			
			if ( isLeftChild ){
				parent.leftChild = current.rightChild;
			}else{
				parent.rightChild = current.rightChild;
			}
			return true;
			
		}else if ( current.leftChild != null  && current.rightChild == null ){
			
			if( isLeftChild ){
				parent.leftChild =  current.leftChild;
			}else{
				parent.rightChild = current.leftChild;
			}
			return true;
		}
		
		/**
		 * TODO Third case, node has both children 
		 * To delete a node with two children, replace the node with its inorder succesor
		 */
		if (current.leftChild != null  && current.rightChild != null  ){
			Node successor = getSuccesor(current);
			
			if ( current == root){
				root = successor;
			}else if (isLeftChild ){
				parent.leftChild = successor;
			}else{
				parent.rightChild = successor;
			}
			
			successor.leftChild = current.leftChild;
		}
		
		return true;
	}
	
	public Node getSuccesor( Node delNode ){
		
		
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild;
		
		while ( current != null ){
			
			successorParent = successor;
			successor = current;
			current = current.leftChild;
			
		}
		
		/**
		 * If successor is not right child: 
		 * make right child , left child
		 */
		
		if ( successor != delNode.rightChild ){
			
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;

		}
		
		return successor;
	}
	
	public Node findMinimumNode( Node node ){
		
		Node current = node;
		Node last = node;
		while (  current != null) {
			last = current;
			current = current.leftChild;
		}
		
		return last;
	}
}

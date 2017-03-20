package com.github.eduzol.algol.tree;

public class Tree {

	private Node root;
	
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
	
	
	public void delete(int ket ){
		
	}
	
}

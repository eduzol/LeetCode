package com.github.eduzol.algol.tree;

public class Node {
	
	Value value;
	Node leftChild;
	Node rightChild;
	
	public Node(){
		super();
		this.value = new Value();
	}
	
	public Node(int key, double value){
		super();
		this.value = new Value(key, value);
	}
	
	public void displayNode(){
		
	}

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}
	
	
}

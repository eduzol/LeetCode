package com.github.eduzol.algol.tree;

import java.util.Deque;
import java.util.LinkedList;

public class TreePath {
	
	private Deque<Node> path = new LinkedList<Node>();
	
	public void addNode(Node node){
		path.push(node);
	}
	
	public void pop(){
		path.pop();
	}
	
	@Override
	public String toString(){
		
		StringBuilder builder = new StringBuilder();
		for ( Node node : path){
			builder.append(node+" ");
		}
		return builder.toString();
	}

}

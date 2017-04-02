package com.github.eduzol.algol.linkedlist;

public class Link {
	
	public int iData;
	public Link next;
	public Link previous;
	
	public Link(int data){
		this.iData = data;
	}
	
	@Override
	public String toString() {
		return "Link [iData=" + iData + "]";
	}
	
}

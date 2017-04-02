package com.github.eduzol.algol.linkedlist;

public interface LinkedList {

	public boolean isEmpty();
	public int size();
	public void insertFirst( int value  );
	public void insertLast( int value );
	public Link deleteFirst();
	public Link deleteLast();
	public boolean insertAfter( int key, int value );
	public Link deleteKey(int key);
	public String displayForward();
	public String displayBackward();
	
	
	
}

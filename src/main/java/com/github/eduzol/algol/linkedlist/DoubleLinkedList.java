package com.github.eduzol.algol.linkedlist;

public class DoubleLinkedList implements LinkedList {

	//Sentinel nodes
	private Link header;
	private Link tailer;
	private int size = 0;
	
	public DoubleLinkedList(){
		header = new Link(0);
		tailer = new Link(0);
		header.next = tailer;
		tailer.previous = header;
	}
	
	public boolean isEmpty() {
	
		if ( header == null){
			return true;
		}else{
			return false;
		}
	}
	
	public void insertFirst(int value) {
		addBetween(value, header, header.next);
	}

	public void insertLast(int value) {
		addBetween(value, tailer.previous , tailer);
	}

	public Link deleteFirst() {
	    
		Link link = header.next;
		remove(link);
		return link;
	}

	public Link deleteLast() {
		Link link = tailer.previous;
		remove(link);
		return link;
	}

	public boolean insertAfter(int key, int value) {

		Link link = find(key);
		
		if ( link != null ){
			addBetween(value, link, link.next );
			return true;
			
		}else{
			
			return false;
		}
		
	}

	public Link deleteKey(int key) {
		
		Link link =  find(key);
		if ( link != null){
			remove(link);
			return link;
		}else{
			return null;
		}
		
		
		
	}

	public String displayForward() {
		
		StringBuilder builder = new StringBuilder();
		Link current = header.next;
		builder.append("[");
		while ( current!= null && current != tailer ){
			
			builder.append(current.iData);
			if ( current.next != tailer){
				builder.append(",");
			}
			current = current.next;
		}
		builder.append("]");
		return builder.toString();
	}

	public String displayBackward() {
		
		StringBuilder builder  = new StringBuilder();
		Link current = tailer.previous;
		builder.append("[");

		while ( current!= null  && current != header){
			
			builder.append(current.iData);
			if ( current.previous != header){
				builder.append(",");
			}
			current = current.previous;
		}
		
		builder.append("]");
		return builder.toString();
		
	}
	
	private Link find( int key ){
		
		Link current = header.next;
		
		while ( current!= null && current != tailer ){
			
			if ( current.iData == key){
				return current;
			}
			current = current.next;
		}
		
		return null;
		
	}

	private void addBetween( int data, Link prev, Link next){
	
		Link link  = new Link(data);
		link.next = next;
		link.previous = prev;
		prev.next = link;
		next.previous = link;
		size++;
		return;
	}

	private void remove(Link link){
		
		link.previous.next = link.next;
		link.next.previous = link.previous;
		size--;
	}
	public int size() {
		return size;
	}


}

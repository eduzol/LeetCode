package com.github.eduzol.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution232 {

	/**
	Implement the following operations of a queue using stacks.
	push(x) -- Push element x to the back of queue.
	pop() -- Removes the element from in front of queue.
	peek() -- Get the front element.
	empty() -- Return whether the queue is empty.
	Notes:
	You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
	Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
	You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
	*/
	
	public class MyQueue {

	    /** Initialize your data structure here. */
	    public MyQueue() {
	        
	    }
	    
	    Deque<Integer> enqueStack = new LinkedList<Integer>();
	    Deque<Integer> dequeStack =  new LinkedList<Integer>(); 
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	        enqueStack.push(x);
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	        
	    	if (empty()){
	    		return -1;//exception
	    	}
	    	
	    	if ( dequeStack.isEmpty() ){
	    		while(!enqueStack.isEmpty()){
	    			dequeStack.push(enqueStack.pop());
	    		}
	    	}
	    	
	    	Integer element = dequeStack.pop();
	    	
	    	return element;
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	    	 
	    	if (empty()){
	    		return -1;//exception
	    	}
	    	
	    	if ( dequeStack.isEmpty() ){
	    		while(!enqueStack.isEmpty()){
	    			dequeStack.push(enqueStack.pop());
	    		}
	    	}
	    	
	    	Integer element = dequeStack.peek();
	    	
	    	return element;
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        return enqueStack.isEmpty() && dequeStack.isEmpty();
	    }
	}

	
}

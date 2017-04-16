package com.github.eduzol.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution255 {
	/**
	 * Your MyStack object will be instantiated and called as such:
	 * MyStack obj = new MyStack();
	 * obj.push(x);
	 * int param_2 = obj.pop();
	 * int param_3 = obj.top();
	 * boolean param_4 = obj.empty();
	 */
	
	
	class MyStack {
	
	/**
	 * A stack can be implemented using two queues	
	 */
		
	/**
	 * Method 1 (By making push operation costly)
	 */
		
	/**
	 * 	Method 2 (By making pop operation costly)
	 */
	
	Queue<Integer> q1 =  new LinkedList<Integer>();
	Queue<Integer> q2 =  new LinkedList<Integer>();
		
	/** Initialize your data structure here. */
	public MyStack() {
	    
	}
	
	/** Push element x onto stack. */
	public void push(int x) {
	    
		if ( q1.isEmpty() ){
			q1.add(x);
			for( int i = 0 ; i <  q2.size(); i++){
				q1.add(q2.poll());
			}
		}else{
			q2.add(x);
			for( int i = 0 ; i < q1.size(); i++){
				q2.add(q1.poll());
			}
		}
	}
	
	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		
		Integer top = -1;
		
	    if ( q1.isEmpty() ){
	    	top =  q2.poll();
	    	
	    }else{
	    	top =  q1.poll();
	    }
	    
	    return top; 
	}
	
	/** Get the top element. */
	public int top() {
		Integer top = -1;
		if ( q1.isEmpty() ){
	    	top =  q2.peek();
	    	
	    }else{
	    	top =  q1.peek();
	    }
		return top;
	}
	
	/** Returns whether the stack is empty. */
    public boolean empty() {
	        return q1.isEmpty() && q2.isEmpty();
    }

	}

}

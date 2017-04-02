package com.github.eduzol.leetcode;

import org.junit.Assert;
import org.junit.Test;

import com.github.eduzol.algol.linkedlist.DoubleLinkedList;
import com.github.eduzol.algol.linkedlist.LinkedList;

public class DoubleLinkedListTest {
	
	@Test
	public void test(){
		
		LinkedList list  = new DoubleLinkedList();
		
		System.out.println(list.displayForward());
		
		list.insertFirst(2);
		
		System.out.println(list.displayForward());
		
		list.insertFirst(1);
		
		System.out.println(list.displayForward());
		System.out.println("size " + list.size());
		
		list.insertLast(3);
		System.out.println(list.displayForward());
		System.out.println("size " + list.size());

		System.out.println(list.displayBackward());
		System.out.println("size " + list.size());
		
		list.insertAfter(2, 4);
		System.out.println(list.displayForward());
		System.out.println("size " + list.size());

		list.deleteKey(4);
		System.out.println(list.displayForward());
		System.out.println("size " + list.size());

		
		list.deleteFirst();
	
		System.out.println(list.displayForward());
		System.out.println("size " + list.size());
		
		list.deleteLast();
		
		System.out.println(list.displayForward());
		System.out.println("size " + list.size());

		Assert.assertTrue(true);
		
	}
}

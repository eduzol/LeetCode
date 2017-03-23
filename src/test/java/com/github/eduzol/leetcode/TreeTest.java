package com.github.eduzol.leetcode;
import org.junit.Assert;
import org.junit.Test;

import com.github.eduzol.algol.tree.Node;
import com.github.eduzol.algol.tree.Tree;

public class TreeTest {

	
	@Test
	public void testInsert(){
		Tree tree = new Tree();
		
		tree.insert(50, 1.5);
		tree.insert(25, 1.7);
		tree.insert(75, 1.9);
		
		Node node = tree.find(25);
		Assert.assertNotNull(node);
		Assert.assertEquals(node.getValue().getValue()  , 1.7 , 0.1 );
		
	}
	
	
	@Test
	public void testTraversal(){
		
		Tree tree = new Tree();
		tree.insert(50, 1.5);
		tree.insert(25, 1.7);
		tree.insert(75, 1.9);
		tree.displayTree();

	}
	
	@Test
	public void testDeleteNodeNoChildren(){
		
		Tree tree = new Tree();
		tree.insert(50, 1.5);
		tree.insert(25, 1.7);
		tree.insert(75, 1.9);
		
		boolean isDeleted = tree.delete(75);
		Node foundNode = tree.find(75);
		tree.displayTree();
		
		Assert.assertTrue(isDeleted);
		Assert.assertNull(foundNode);
		
	}
	
	@Test
	public void testDeleteNodeOneChildren(){
		
		Tree tree = new Tree();
		tree.insert(50, 1.5);
		tree.insert(25, 1.7);
		tree.insert(75, 1.9);
		tree.insert(100 ,3.1);
		
		
		boolean isDeleted = tree.delete(75);
		Node foundNode = tree.find(75);
		tree.displayTree();
		
		Assert.assertTrue(isDeleted);
		Assert.assertNull(foundNode);
		
	}
	
	@Test
	public void testMinimumValues() {
		
		Tree tree = new Tree();
		tree.insert(50, 1.5);
		tree.insert(25, 1.7);
		tree.insert(75, 1.9);
		tree.insert(1, 1.7);
		tree.insert(100 ,3.1);
		
		Node minimum = tree.findMinimumNode(tree.getRoot());
		
		Assert.assertNotNull(minimum);
		Assert.assertEquals(minimum.getValue().getKey(), 1);
	}
	
	@Test
	public void testMinimumValuesSingleNode(){
		
		Tree tree = new Tree();
		tree.insert(50, 1.5);
		
		Node minimum = tree.findMinimumNode(tree.getRoot());
		
		Assert.assertNotNull(minimum);
		Assert.assertEquals(minimum.getValue().getKey(), 50);
	}
}


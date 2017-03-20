package com.github.eduzol.leetcode;
import org.junit.Test;
import org.junit.Assert;

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
}


package com.github.eduzol.leetcode;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.github.eduzol.algol.tree.Node;
import com.github.eduzol.algol.tree.Tree;
import com.github.eduzol.algol.tree.TreeUtilities;

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
	
	@Test
	public void testNodeDeleteTwoChildren(){
		
		Tree tree = new Tree();
		tree.insert(50, 50.50);
		tree.insert(75, 75.75);
		tree.insert(62, 62.62);
		tree.insert(87, 87.87);
		tree.insert(77, 77.77);
		tree.insert(93, 93.93);
		tree.insert(79, 79.79);
		
		boolean isDeleted  = tree.delete(75);
		Node node = tree.find(77);
		tree.displayTree();
		
		Assert.assertTrue(isDeleted);
		Assert.assertNotNull(node);
		Assert.assertEquals( node.getLeftChild().getValue().getKey(), 62);
		Assert.assertEquals( node.getRightChild().getValue().getKey(), 87);
		
	}
	
	@Test
	public void testDFS(){
		
		Tree tree = new Tree();
		tree.insert(50, 50.50);
		tree.insert(75, 75.75);
		tree.insert(62, 62.62);
		tree.insert(87, 87.87);
		tree.insert(77, 77.77);
		tree.insert(93, 93.93);
		tree.insert(79, 79.79);
		
		TreeUtilities util = new TreeUtilities();
		
		Node node = util.search(tree, 77);
		
		Assert.assertNotNull(node);
		Assert.assertEquals(node.getValue().getValue(), 77.77 , .5);
		Assert.assertEquals(node.getValue().getKey(), 77 );
		
	}
	
	@Test
	public void printPaths(){
		
		Tree tree = new Tree();
		tree.insert(50, 50.50);
		tree.insert(75, 75.75);
		tree.insert(62, 62.62);
		tree.insert(87, 87.87);
		tree.insert(77, 77.77);
		tree.insert(93, 93.93);
		tree.insert(79, 79.79);
		
		TreeUtilities util = new TreeUtilities();
		
		List<String>  paths  =	util.getBinarySearchTreePaths(tree);
		
		for (String path : paths ){
			System.out.println(path);
		}
	
		Assert.assertEquals(paths.size(),3);
		
	}
	
	@Test
	public void testBinaryTreeDepth(){
		
		Tree tree = new Tree();
		tree.insert(50, 50.50);
		tree.insert(75, 75.75);
		tree.insert(62, 62.62);
		tree.insert(87, 87.87);
		tree.insert(77, 77.77);
		tree.insert(93, 93.93);
		tree.insert(79, 79.79);
		
		TreeUtilities util = new TreeUtilities();
		
		int  depth  =	util.getMaxDepth(tree);
		
		Assert.assertEquals(depth,5);
		
		
	}
	
	@Test
	public void inOrderTraversalTest(){
		
		Tree tree = new Tree();
		tree.insert(50, 50.50);
		tree.insert(75, 75.75);
		tree.insert(62, 62.62);
		tree.insert(87, 87.87);
		tree.insert(77, 77.77);
		tree.insert(93, 93.93);
		tree.insert(79, 79.79);
		
		TreeUtilities util = new TreeUtilities();
		
		List<Double>  results  =	util.inOrderTraversal(tree.getRoot());

		for ( int i = 0 ; i < (results.size() -1 ) ; i++ ) {
				
			Double value = results.get(i);
			Double value2 =  results.get(i+1);
			Assert.assertTrue(value < value2);
		}
		
	}
	
	@Test
	public void preOrderTraversalTest(){
		
		Tree tree = new Tree();
		tree.insert(50, 50.50);
		tree.insert(75, 75.75);
		tree.insert(62, 62.62);
		tree.insert(87, 87.87);
		tree.insert(77, 77.77);
		tree.insert(93, 93.93);
		tree.insert(79, 79.79);
		
		TreeUtilities util = new TreeUtilities();
		
		List<Double>  results  =	util.preOrderTrasversal(tree.getRoot());
		
		for( Double value : results  ){
			System.out.println(value);
		}
		
	}
	
	
	@Test
	public void testBFS(){
		
		Tree tree = new Tree();
		tree.insert(50, 50.50);
		tree.insert(75, 75.75);
		tree.insert(62, 62.62);
		tree.insert(87, 87.87);
		tree.insert(77, 77.77);
		tree.insert(93, 93.93);
		tree.insert(79, 79.79);
		
		TreeUtilities util = new TreeUtilities();
		
		Node node = util.breadthFirstSearch(tree, 77);
		
		Assert.assertNotNull(node);
		Assert.assertEquals(node.getValue().getValue(), 77.77 , .5);
		Assert.assertEquals(node.getValue().getKey(), 77 );
		
	}
}


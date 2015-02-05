package com.algspractice.node.ut;

import com.algspractice.node.ds.TreeNode;
import com.algspractice.node.probs.trees.ValidateBinaryTree;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by jtobin on 01/02/15.
 */
public class ValidateBinaryTreeTest {

    private TreeNode<Integer> negRoot;
    private TreeNode<Integer> posRoot;
    private TreeNode<Integer> nullRoot;
    @Before
    public void before() {

        //create positive case
        TreeNode<Integer> root = new TreeNode<Integer>(8);
        root.setLeft(new TreeNode<Integer>(3));
        root.setRight(new TreeNode<Integer>(10));
        posRoot = root;
        root = root.getLeft();
        root.setLeft(new TreeNode<Integer>(1));
        root.setRight(new TreeNode<Integer>(6));
        root = root.getRight();
        root.setLeft(new TreeNode<Integer>(4));
        root.setRight(new TreeNode<Integer>(7));
        root = posRoot.getRight();
        root.setRight(new TreeNode<Integer>(14));
        root = root.getRight();
        root.setLeft(new TreeNode<Integer>(13));




        //create negative case
        root = new TreeNode<Integer>(20);
        root.setLeft(new TreeNode<Integer>(10));
        root.setRight(new TreeNode<Integer>(30));
        negRoot = root;
        root = root.getRight();
        root.setLeft(new TreeNode<Integer>(5));
        root.setRight(new TreeNode<Integer>(40));

        //create null base case
        nullRoot = null;
    }

    @Test
    public void testPositiveCase() {
        assertTrue(ValidateBinaryTree.isValidBST(posRoot));
    }

    @Test
    public void testNegativeCase() {
        assertFalse(ValidateBinaryTree.isValidBST(negRoot));
    }
}

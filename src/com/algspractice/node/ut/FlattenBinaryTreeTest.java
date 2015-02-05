package com.algspractice.node.ut;

import com.algspractice.node.ds.LinkedNode;
import com.algspractice.node.ds.Node;
import com.algspractice.node.ds.TreeNode;
import com.algspractice.node.probs.trees.FlattenBinaryTree;
import com.algspractice.node.utils.Util;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jtobin on 04/02/15.
 */
public class FlattenBinaryTreeTest {


    private TreeNode root;
    @Before
    public void before() {
        TreeNode<Integer> tmp = new TreeNode<Integer>(1);
        root = tmp;
        tmp.setLeft(new TreeNode<Integer>(2));
        tmp.setRight(new TreeNode<Integer>(5));
        tmp = tmp.getLeft();
        tmp.setLeft(new TreeNode<Integer>(3));
        tmp.setRight(new TreeNode<Integer>(4));
        tmp = root.getRight();
        tmp.setRight(new TreeNode<Integer>(6));



    }

    @Test
    public void testPositive() {
        LinkedNode t =  FlattenBinaryTree.flatten(root);
        assertEquals("123456", Util.convertLinkedNodeToString(t));
    }

}

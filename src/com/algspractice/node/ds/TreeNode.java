package com.algspractice.node.ds;

/**
 * Created by TobinJ on 1/14/2015.
 */
public class TreeNode<T> extends Node<T> {

    public TreeNode<T> left;
    public TreeNode<T> right;

    public TreeNode(T val) {
        super(val);
        right = null;
        left = null;
    }
}

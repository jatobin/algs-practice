package com.algspractice.node.ds;

/**
 * Created by TobinJ on 1/14/2015.
 */
public class TreeNode<T> extends Node<T> {

    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T val) {
        super(val);
        this.right = null;
        this.left = null;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }


}

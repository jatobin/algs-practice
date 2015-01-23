package com.algspractice.node.ds;

/**
 * Created by jtobin on 22/01/15.
 */
public class Node<T> {
    protected T val;

    public Node(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {this.val = val;}
}

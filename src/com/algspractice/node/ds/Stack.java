package com.algspractice.node.ds;

import com.algspractice.node.ds.Node;

/**
 * Created by TobinJ on 1/14/2015.
 */
public class Stack<T> {

    Node<T> top;

    public Stack(T top) {
        this.top = new Node(top);
    }

    public T peek() {
        if (top != null) {
            return top.getVal();
        }
        return null;
    }

    public void push(T val) {
        Node<T> xval = new Node<T>(val);
        if (xval != null) {
            xval.setNext(top);
            top = xval;
        }
    }

    public T pop() {
        if (top == null) {
            return null;
        } else {
            Node<T> temp = new Node<T>(top.getVal());
            top = top.getNext();
            return temp.getVal();
        }
    }

}

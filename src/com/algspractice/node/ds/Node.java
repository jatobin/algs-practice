package com.algspractice.node.ds;

/**
 * Created by TobinJ on 1/14/2015.
 */
public class Node<T> {
    private T val;
    private Node<T> next;

    public Node(T val) {
        this.val = val;
        next = null;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {this.val = val;}

    @Override
    public boolean equals(Object o) {
        if ( !(o instanceof Node)) {
              return false;
        } else {
            Node temp = (Node) o;
            return this.getVal().equals(temp.getVal());
        }
    }

}

package com.algspractice.node.ds;

/**
 * Created by TobinJ on 1/14/2015.
 */
public class LinkedNode<T> extends Node<T> {
    private LinkedNode<T> next;

    public LinkedNode(T val) {
        super(val);
        next = null;
    }

    public void setNext(LinkedNode<T> next) {
        this.next = next;
    }

    public LinkedNode<T> getNext() {
        return next;
    }

    @Override
    public boolean equals(Object o) {
        if ( !(o instanceof LinkedNode)) {
              return false;
        } else {
            LinkedNode temp = (LinkedNode) o;
            return this.getVal().equals(temp.getVal());
        }
    }

}

package com.algspractice.node;

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

}

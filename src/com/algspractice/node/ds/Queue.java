package com.algspractice.node.ds;

import com.algspractice.node.ds.Node;

/**
 * Created by TobinJ on 1/14/2015.
 */
public class Queue<T> {

    private Node<T> first,last;

    public void Queue() {};

    public void enqueue(T val) {
        if (first == null) {
            first = new Node<T>(val);
            last = first;
        } else {
            Node temp = new Node<T>(val);
            last.setNext(temp);
            last = temp;
        }
    }

    public T dequeue() {
        if (first == null) {
            return null;
        } else {
            Node<T> t = new Node(first.getVal());
            first = first.getNext();
            return t.getVal();
        }
    }
}

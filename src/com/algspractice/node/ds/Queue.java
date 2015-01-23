package com.algspractice.node.ds;

/**
 * Created by TobinJ on 1/14/2015.
 */
public class Queue<T> {

    private LinkedNode<T> first,last;


    public Queue() {
        first = null;
        last = null;
    }

    public void enqueue(T val) {
        if (first == null) {
            first = new LinkedNode<T>(val);
            last = first;
        } else {
            LinkedNode temp = new LinkedNode<T>(val);
            last.setNext(temp);
            last = temp;
        }
    }

    public T dequeue() {
        if (first == null) {
            return null;
        } else {
            LinkedNode<T> t = new LinkedNode(first.getVal());
            first = first.getNext();
            return t.getVal();
        }
    }
}

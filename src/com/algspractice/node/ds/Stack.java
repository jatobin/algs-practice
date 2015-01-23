package com.algspractice.node.ds;

/**
 * Created by TobinJ on 1/14/2015.
 */
public class Stack<T> {

    private LinkedNode<T> top;

    public Stack(T top) {
        this.top = new LinkedNode(top);
    }

    public Stack() {
        top = null;
    }
    public T peek() {
        if (top != null) {
            return top.getVal();
        }
        return null;
    }

    public void push(T val) {
        if (val != null) {
            LinkedNode<T> tempNode = new LinkedNode<T>(val);
            tempNode.setNext(top);
            top = tempNode;
        }
    }

    public T pop() {
        if (top == null) {
            return null;
        } else {
            Node<T> temp = new LinkedNode<T>(top.getVal());
            top = top.getNext();
            return temp.getVal();
        }
    }

    public boolean empty() {
        return top == null;
    }
}

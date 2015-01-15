package com.algspractice.node.ut;

import com.algspractice.node.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by TobinJ on 1/14/2015.
 */
public class NodeTest {

    @Test
    public void NodeTest1() {
        Node s = new Node<Integer>(5);
        s.setNext(new Node<Integer>(6));
        s.getNext().setNext(new Node<Integer>(7));

        assertEquals(s.getVal(), 5);
        s = s.getNext();
        assertEquals(s.getVal(), 6);
        s = s.getNext();
        assertEquals(s.getVal(), 7);

    }

}

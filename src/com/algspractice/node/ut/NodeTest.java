package com.algspractice.node.ut;

import com.algspractice.node.ds.LinkedNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by TobinJ on 1/14/2015.
 */
public class NodeTest {

    @Test
    public void NodeTest1() {
        LinkedNode s = new LinkedNode<Integer>(5);
        s.setNext(new LinkedNode<Integer>(6));
        s.getNext().setNext(new LinkedNode<Integer>(7));

        assertEquals(s.getVal(), 5);
        s = s.getNext();
        assertEquals(s.getVal(), 6);
        s = s.getNext();
        assertEquals(s.getVal(), 7);

    }

}

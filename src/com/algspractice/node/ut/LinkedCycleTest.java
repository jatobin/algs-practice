package com.algspractice.node.ut;

import com.algspractice.node.ds.Node;
import com.algspractice.node.probs.LinkedCycle;

import static org.junit.Assert.assertEquals;

/**
 * Created by jtobin on 19/01/15.
 */
public class LinkedCycleTest {

    public void LinkedCycleTest() {
        Node a = new Node<Integer>(1);
        Node b = new Node<Integer>(2);
        a.setNext(b);
        Node c = new Node<Integer>(3);
        b.setNext(c);
        c.setNext(a);

        assertEquals(true, LinkedCycle.hasCycle(a));

    }


}

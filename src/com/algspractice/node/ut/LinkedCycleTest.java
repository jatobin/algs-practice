package com.algspractice.node.ut;

import com.algspractice.node.ds.LinkedNode;
import com.algspractice.node.probs.list.LinkedCycle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jtobin on 19/01/15.
 */
public class LinkedCycleTest {

    @Test
    public void LinkedCycleTest() {
        LinkedNode a = new LinkedNode<Integer>(1);
        LinkedNode b = new LinkedNode<Integer>(2);
        a.setNext(b);
        LinkedNode c = new LinkedNode<Integer>(3);
        b.setNext(c);
        c.setNext(a);

        assertEquals(true, LinkedCycle.hasCycle(a));

    }


}

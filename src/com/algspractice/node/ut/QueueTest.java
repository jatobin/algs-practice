package com.algspractice.node.ut;

import com.algspractice.node.Queue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by TobinJ on 1/14/2015.
 */
public class QueueTest {

    @Test
    public void QueueTest1() {
        Queue q = new Queue<Integer>();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);

        assertEquals(q.dequeue(), 5);
        assertEquals(q.dequeue(), 6);
        assertEquals(q.dequeue(), 7);
    }
}

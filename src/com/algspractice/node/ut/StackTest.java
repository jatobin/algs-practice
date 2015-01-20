package com.algspractice.node.ut;

import com.algspractice.node.ds.Stack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by TobinJ on 1/14/2015.
 */
public class StackTest {

    @Test
    public void StackTest1() {

        Stack s = new Stack<Integer>(5);
        s.push(6);
        s.push(7);

        assertEquals(s.peek(),7);
        assertEquals(s.pop(), 7);
        assertEquals(s.pop(), 6);
        assertEquals(s.pop(), 5);

        s.push(12);
        s.push(15);
        assertEquals(s.pop(), 15);
    }
}

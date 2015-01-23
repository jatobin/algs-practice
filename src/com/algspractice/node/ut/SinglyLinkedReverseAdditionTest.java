package com.algspractice.node.ut;

import com.algspractice.node.ds.LinkedNode;
import com.algspractice.node.probs.SinglyLinkedReverseAddition;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jtobin on 17/01/15.
 */
public class SinglyLinkedReverseAdditionTest {

    @Test
    public void firstTest() {

        LinkedNode<Integer> a = new LinkedNode<Integer>(7);
        LinkedNode<Integer> ahead = a;
        a.setNext(new LinkedNode<Integer>(5));
        a = a.getNext();
        a.setNext(new LinkedNode<Integer>(2));
        //752

        LinkedNode<Integer> b = new LinkedNode<Integer>(2);
        LinkedNode<Integer> bhead = b;
        b.setNext(new LinkedNode<Integer>(2));
        b = b.getNext();
        b.setNext(new LinkedNode<Integer>(2));
        //222


        //Expected result = 9 7 4
        LinkedNode<Integer> result = SinglyLinkedReverseAddition.addTwoLists(ahead,bhead);
        assertEquals(new Integer(9), result.getVal());
        result = result.getNext();
        assertEquals(new Integer(7), result.getVal());
        result = result.getNext();
        assertEquals(new Integer(4), result.getVal());

    }

    @Test
    public void firstVarLongerTest() {

        LinkedNode<Integer> a = new LinkedNode<Integer>(1);
        LinkedNode<Integer> ahead = a;
        a.setNext(new LinkedNode<Integer>(9));
        a = a.getNext();
        a.setNext(new LinkedNode<Integer>(9));
        a = a.getNext();
        a.setNext(new LinkedNode<Integer>(1));
        //1991

        LinkedNode<Integer> b = new LinkedNode<Integer>(2);
        LinkedNode<Integer> bhead = b;
        b.setNext(new LinkedNode<Integer>(2));
        b = b.getNext();
        b.setNext(new LinkedNode<Integer>(7));
        //227


        //Expected result = 3121
        LinkedNode<Integer> result = SinglyLinkedReverseAddition.addTwoLists(ahead,bhead);
        assertEquals(new Integer(3), result.getVal());
        result = result.getNext();
        assertEquals(new Integer(1), result.getVal());
        result = result.getNext();
        assertEquals(new Integer(7), result.getVal());
        result = result.getNext();
        assertEquals(new Integer(2), result.getVal());

    }


    @Test
    public void secondVarLongerTest() {

        LinkedNode<Integer> a = new LinkedNode<Integer>(1);
        LinkedNode<Integer> ahead = a;
        a.setNext(new LinkedNode<Integer>(9));
        a = a.getNext();
        a.setNext(new LinkedNode<Integer>(9));
        a = a.getNext();
        a.setNext(new LinkedNode<Integer>(0));
        //1990

        LinkedNode<Integer> b = new LinkedNode<Integer>(2);
        LinkedNode<Integer> bhead = b;
        b.setNext(new LinkedNode<Integer>(2));
        b = b.getNext();
        b.setNext(new LinkedNode<Integer>(2));
        //222


        //Expected result = 3121
        LinkedNode<Integer> result = SinglyLinkedReverseAddition.addTwoLists(bhead,ahead);
        assertEquals(new Integer(3), result.getVal());
        result = result.getNext();
        assertEquals(new Integer(1), result.getVal());
        result = result.getNext();
        assertEquals(new Integer(2), result.getVal());
        result = result.getNext();
        assertEquals(new Integer(1), result.getVal());

    }


}

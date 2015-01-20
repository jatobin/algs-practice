package com.algspractice.node.ut;

import com.algspractice.node.ds.Node;
import com.algspractice.node.probs.SinglyLinkedReverseAddition;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jtobin on 17/01/15.
 */
public class SinglyLinkedReverseAdditionTest {

    @Test
    public void firstTest() {

        Node<Integer> a = new Node<Integer>(7);
        Node<Integer> ahead = a;
        a.setNext(new Node<Integer>(5));
        a = a.getNext();
        a.setNext(new Node<Integer>(2));
        //752

        Node<Integer> b = new Node<Integer>(2);
        Node<Integer> bhead = b;
        b.setNext(new Node<Integer>(2));
        b = b.getNext();
        b.setNext(new Node<Integer>(2));
        //222


        //Expected result = 9 7 4
        Node<Integer> result = SinglyLinkedReverseAddition.addTwoLists(ahead,bhead);
        assertEquals(new Integer(9), result.getVal());
        result = result.getNext();
        assertEquals(new Integer(7), result.getVal());
        result = result.getNext();
        assertEquals(new Integer(4), result.getVal());

    }

    @Test
    public void firstVarLongerTest() {

        Node<Integer> a = new Node<Integer>(1);
        Node<Integer> ahead = a;
        a.setNext(new Node<Integer>(9));
        a = a.getNext();
        a.setNext(new Node<Integer>(9));
        a = a.getNext();
        a.setNext(new Node<Integer>(1));
        //1991

        Node<Integer> b = new Node<Integer>(2);
        Node<Integer> bhead = b;
        b.setNext(new Node<Integer>(2));
        b = b.getNext();
        b.setNext(new Node<Integer>(7));
        //227


        //Expected result = 3121
        Node<Integer> result = SinglyLinkedReverseAddition.addTwoLists(ahead,bhead);
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

        Node<Integer> a = new Node<Integer>(1);
        Node<Integer> ahead = a;
        a.setNext(new Node<Integer>(9));
        a = a.getNext();
        a.setNext(new Node<Integer>(9));
        a = a.getNext();
        a.setNext(new Node<Integer>(0));
        //1990

        Node<Integer> b = new Node<Integer>(2);
        Node<Integer> bhead = b;
        b.setNext(new Node<Integer>(2));
        b = b.getNext();
        b.setNext(new Node<Integer>(2));
        //222


        //Expected result = 3121
        Node<Integer> result = SinglyLinkedReverseAddition.addTwoLists(bhead,ahead);
        assertEquals(new Integer(3), result.getVal());
        result = result.getNext();
        assertEquals(new Integer(1), result.getVal());
        result = result.getNext();
        assertEquals(new Integer(2), result.getVal());
        result = result.getNext();
        assertEquals(new Integer(1), result.getVal());

    }


}

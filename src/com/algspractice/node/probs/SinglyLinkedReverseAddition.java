package com.algspractice.node.probs;

import com.algspractice.node.ds.LinkedNode;

/**
 * Created by jtobin on 17/01/15.
 */
public class SinglyLinkedReverseAddition {

    public static LinkedNode addTwoLists(LinkedNode<Integer> a, LinkedNode<Integer> b) {

        LinkedNode<Integer> result = new LinkedNode<Integer>(0);
        LinkedNode<Integer> resultHead = result;
        boolean carry = false;

        while ((a != null && a.getVal() != null) && (b != null && b.getVal() != null)) {

            int tmpA = a.getVal();
            int tmpB = b.getVal();

            int tmpC = tmpA + tmpB + (carry? 1 : 0);
            if (tmpC > 9) {
                carry = true;
                tmpC = tmpC - 10;
            } else {
                carry = false;
            }

            result.setVal(tmpC);

            a = a.getNext();
            b = b.getNext();

            result.setNext(new LinkedNode<Integer>(0));
            result = result.getNext();
        }

        while (a != null && a.getVal() != null ) { //while the A list still has numbers
            result.setVal(a.getVal() + (carry? 1 : 0));
            carry = false;
            a = a.getNext();
            result.setNext(new LinkedNode<Integer>(0));
            result = result.getNext();
        }

        while (b != null && b.getVal() != null ) { //while the B list still has numbers
            result.setVal(b.getVal() + (carry? 1 : 0));
            carry = false;
            b = b.getNext();
            result.setNext(new LinkedNode<Integer>(0));
            result = result.getNext();
        }
        return resultHead;
    }
}

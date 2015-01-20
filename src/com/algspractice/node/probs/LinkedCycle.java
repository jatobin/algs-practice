package com.algspractice.node.probs;

import com.algspractice.node.ds.Node;

/**
 * Created by jtobin on 19/01/15.
 */
public class LinkedCycle {

    public static boolean hasCycle(Node head) {

        Node fast = head;
        Node slow = head;

        //not sure i believe this solution - what if the first and last node form a cycle? this alg
        //would not find it...
        if (head == null || head.getNext() == null) return false;

        while (fast !=null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if (fast.equals(slow)) return true;
        }

        return false;
    }
}

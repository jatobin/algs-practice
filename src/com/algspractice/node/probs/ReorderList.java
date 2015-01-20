package com.algspractice.node.probs;

import com.algspractice.node.ds.Node;

/**
 * Created by jtobin on 17/01/15.
 */
public class ReorderList {

    public static void reorderList(Node head) {

        //determine the midpoint and end of the list using fast and slow pointers
        //reverse the second list
        //merge the two lists {1,2,3,4} -> {1,4,2,3]

        if (head == null || head.getNext() == null) return;

        Node fast = head;
        Node slow = head;
        //1 -> 2; 1->3
        //when loop breaks, then fast will be at the end, and slow will be in the middle.
        while (fast.getNext() != null && fast.getNext().getNext() != null) {

            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        Node second = slow.getNext();
        slow.setNext(null);


        //HEAD is at the beginning, SECOND is at the midpoint, and FAST is no more than one away from the end
        second = reverseOrder(second);

        //second is now the head of the reversed list, the end of the reversed list.
        Node p1 = head; //{1}
        Node p2 = second; //{4}

        //merge back together
        //{1->2} {4->3}
        while (p2 != null) {
            Node tmp1 = p1.getNext();
            Node tmp2 = p2.getNext();

            p1.setNext(p2);
            p2.setNext(tmp1);

            p1 = tmp1;
            p2 = tmp2;
        }




    }

    private static Node reverseOrder(Node node) {
        if (node == null || node.getNext() == null) return node;
        Node pre    = node;
        Node curr   = node;

        //A->B->C->D
        //hold C. point B back to A. the new "head" becomes B. then increment both nodes.

        while (curr != null) {
            Node temp = curr.getNext();
            curr.setNext(pre);
            pre = curr;
            curr = temp;
        }
        node.setNext(null);

        return pre;
    }


}

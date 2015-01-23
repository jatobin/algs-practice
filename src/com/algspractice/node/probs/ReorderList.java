package com.algspractice.node.probs;

import com.algspractice.node.ds.LinkedNode;

/**
 * Created by jtobin on 17/01/15.
 */
public class ReorderList {

    public static void reorderList(LinkedNode head) {

        //determine the midpoint and end of the list using fast and slow pointers
        //reverse the second list
        //merge the two lists {1,2,3,4} -> {1,4,2,3]

        if (head == null || head.getNext() == null) return;

        LinkedNode fast = head;
        LinkedNode slow = head;
        //1 -> 2; 1->3
        //when loop breaks, then fast will be at the end, and slow will be in the middle.
        while (fast.getNext() != null && fast.getNext().getNext() != null) {

            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        LinkedNode second = slow.getNext();
        slow.setNext(null);


        //HEAD is at the beginning, SECOND is at the midpoint, and FAST is no more than one away from the end
        second = reverseOrder(second);

        //second is now the head of the reversed list, the end of the reversed list.
        LinkedNode p1 = head; //{1}
        LinkedNode p2 = second; //{4}

        //merge back together
        //{1->2} {4->3}
        while (p2 != null) {
            LinkedNode tmp1 = p1.getNext();
            LinkedNode tmp2 = p2.getNext();

            p1.setNext(p2);
            p2.setNext(tmp1);

            p1 = tmp1;
            p2 = tmp2;
        }




    }

    private static LinkedNode reverseOrder(LinkedNode linkedNode) {
        if (linkedNode == null || linkedNode.getNext() == null) return linkedNode;
        LinkedNode pre    = linkedNode;
        LinkedNode curr   = linkedNode;

        //A->B->C->D
        //hold C. point B back to A. the new "head" becomes B. then increment both nodes.

        while (curr != null) {
            LinkedNode temp = curr.getNext();
            curr.setNext(pre);
            pre = curr;
            curr = temp;
        }
        linkedNode.setNext(null);

        return pre;
    }


}

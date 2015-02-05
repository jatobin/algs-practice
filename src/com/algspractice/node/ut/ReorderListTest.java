package com.algspractice.node.ut;

import com.algspractice.node.ds.LinkedNode;
import com.algspractice.node.probs.list.ReorderList;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jtobin on 17/01/15.
 */
public class ReorderListTest {

    @Test
    public void basicFourLengthTest() {

        LinkedNode a = new LinkedNode<Integer>(1);
        LinkedNode ahead = a;
        a.setNext(new LinkedNode<Integer>(2));
        a = a.getNext();
        a.setNext(new LinkedNode<Integer>(3));
        a = a.getNext();
        a.setNext(new LinkedNode<Integer>(4));
        a = a.getNext();

        //1,2,3,4 -> 1,4,2,3

        ReorderList.reorderList(ahead);

        Assert.assertEquals(1, ahead.getVal());
        ahead = ahead.getNext();
        Assert.assertEquals(4, ahead.getVal());
        ahead = ahead.getNext();
        Assert.assertEquals(2, ahead.getVal());
        ahead = ahead.getNext();
        Assert.assertEquals(3, ahead.getVal());

    }

}

package com.algspractice.node.utils;

import com.algspractice.node.ds.LinkedNode;
import com.algspractice.node.ds.Node;

import java.util.List;

/**
 * Created by jtobin on 04/02/15.
 */
public class Util {

    public static String convertNodeToString(List<Node> l) {

        if (l == null || l.isEmpty()) return "";
        StringBuilder s = new StringBuilder();
        for (Node n : l) {
            if (n != null && n.getVal() != null) s.append(n.getVal().toString());
        }
        return s.toString();
    }

    public static String convertLinkedNodeToString(LinkedNode head) {
        if (head == null) return "";
        StringBuilder b= new StringBuilder();

        LinkedNode tmp = head;
        while (tmp != null) {
            b.append(tmp.getVal().toString());
            tmp = tmp.getNext();
        }

        return b.toString();
    }
}

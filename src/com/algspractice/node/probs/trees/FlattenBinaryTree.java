package com.algspractice.node.probs.trees;

import com.algspractice.node.ds.LinkedNode;
import com.algspractice.node.ds.Stack;
import com.algspractice.node.ds.TreeNode;

/**
 * Created by jtobin on 04/02/15.
 */
public class FlattenBinaryTree {

    public static LinkedNode flatten(TreeNode<Integer> root) {

//            1
//          /   \
//         2     5
//        / \      \
//       3  4       6  -> 1,2,3,4,5,6


        if (root == null) return new LinkedNode<Integer>(null);
        LinkedNode tmp = new LinkedNode<Integer>(null);
        LinkedNode head = tmp;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode<Integer> t = stack.pop();
            if (t.getRight() != null) {
                stack.push(t.getRight());
            }
            if (t.getLeft() != null) {
                stack.push(t.getLeft());
            }

            tmp.setNext(new LinkedNode(t.getVal()));
            tmp = tmp.getNext();
        }

        return head.getNext();

    }
}

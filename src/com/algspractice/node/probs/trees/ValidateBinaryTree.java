package com.algspractice.node.probs.trees;

import com.algspractice.node.ds.TreeNode;

/**
 * Created by jtobin on 01/02/15.
 */
public class ValidateBinaryTree {

    public static boolean isValidBST(TreeNode<Integer> root) {
        return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean validate(TreeNode<Integer> root, Integer min, Integer max) {
        //null is a valid binary tree, and if there is no node, then that is the base
        //case and ist still valid
        if (root == null) return true;
        //check the validity of the binary tree.
        //the nodes value cannot be greater than the minimum, and the node cannot be greater than the maximum
        if ( root.getVal() <= min || root.getVal() >= max) return false;
        return validate(root.getLeft(), min, (Integer) root.getVal()) && validate(root.getRight(), (Integer) root.getVal(), max );

    }
}

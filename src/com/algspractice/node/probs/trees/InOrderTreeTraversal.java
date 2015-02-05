package com.algspractice.node.probs.trees;

import com.algspractice.node.ds.Node;
import com.algspractice.node.ds.Stack;
import com.algspractice.node.ds.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jtobin on 22/01/15.
 */
public class InOrderTreeTraversal implements TreeTraversal {


    @Override
    public List<Node> iterativeTraversal(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<Node> returnList = new ArrayList<Node>();
        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
        TreeNode p = root;
        while (!treeNodeStack.empty() || p != null) {

            //push down all the way left
            if (p != null) {
                treeNodeStack.push(p);
                p = p.getLeft();
            } else {
                TreeNode top = treeNodeStack.pop();
                returnList.add(top);
                p = top.getRight();
            }
        }

        return returnList;
    }

    @Override
    public List<Node> recursiveTraversal(TreeNode root) {
        if (root == null) return Collections.emptyList();

        List<Node> l = new ArrayList<Node>();
        l.addAll(recursiveTraversal(root.getLeft()));
        l.add(root);
        l.addAll(recursiveTraversal(root.getRight()));

        return l;
    }
}

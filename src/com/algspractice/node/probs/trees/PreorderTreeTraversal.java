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
public class PreorderTreeTraversal implements TreeTraversal {

    @Override
    public List<Node> iterativeTraversal(TreeNode root) {
        ArrayList<Node> returnList = new ArrayList<Node>();

        if (root == null) return returnList;
        Stack<TreeNode> s = new Stack<TreeNode>(root);

        while (!s.empty()) {
            TreeNode n = s.pop();
            returnList.add(n);

            if (n.getRight() != null) {
                s.push(n.getRight());
            }

            if(n.getLeft() != null) {
                s.push(n.getLeft());
            }
        }

        return returnList;
    }

    @Override
    public List<Node> recursiveTraversal(TreeNode root) {

        if (root == null) return Collections.emptyList();

        List<Node> returnList = new ArrayList<Node>();
        returnList.add(root);
        returnList.addAll(recursiveTraversal(root.getLeft()));
        returnList.addAll(recursiveTraversal(root.getRight()));

        return returnList;
    }

}

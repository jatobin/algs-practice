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
public class PostOrderTreeTraversal implements TreeTraversal {
    @Override
    public List<Node> iterativeTraversal(TreeNode root) {

        if (root == null) return Collections.emptyList();
        List<Node> returnList = new ArrayList<Node>();
        Stack<TreeNode> nodeStack = new Stack<TreeNode>(root);

        while(!nodeStack.empty()) {
            TreeNode t = nodeStack.pop();

            if (t.getLeft() != null) {
                nodeStack.push(t.getLeft());
            }

            if (t.getRight() != null) {
                nodeStack.push(t.getRight());
            }

            returnList.add(t);

        }

        return returnList;

    }

    @Override
    public List<Node> recursiveTraversal(TreeNode root)
    {

        if (root == null) return Collections.emptyList();

        List<Node> returnList = new ArrayList<Node>();
        returnList.addAll(recursiveTraversal(root.getLeft()));
        returnList.addAll(recursiveTraversal(root.getRight()));
        returnList.add(root);

        return returnList;
    }
}

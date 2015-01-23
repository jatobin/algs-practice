package com.algspractice.node.probs;

import com.algspractice.node.ds.Node;
import com.algspractice.node.ds.TreeNode;

import java.util.List;

/**
 * Created by jtobin on 22/01/15.
 */
public interface TreeTraversal {
    List<Node> iterativeTraversal(TreeNode root);

    List<Node> recursiveTraversal(TreeNode root);
}

package com.algspractice.node.ut;

import apple.laf.JRSUIUtils;
import com.algspractice.node.ds.Node;
import com.algspractice.node.ds.TreeNode;
import com.algspractice.node.probs.InOrderTreeTraversal;
import com.algspractice.node.probs.PostOrderTreeTraversal;
import com.algspractice.node.probs.PreorderTreeTraversal;
import com.algspractice.node.probs.TreeTraversal;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by jtobin on 22/01/15.
 */

enum TraversalType {
        InOrder,
        PreOrder,
        PostOrder};


public class TreeTraversalTest {

    private Map<TraversalType,TreeTraversal> treeTraversalMap;
    private TreeNode root;
    private Map<TraversalType, String> traversalSolutionMap;

    @Before
    public void setUp() {
        treeTraversalMap = new HashMap<TraversalType, TreeTraversal>();
        treeTraversalMap.put(TraversalType.PreOrder, new PreorderTreeTraversal());
        treeTraversalMap.put(TraversalType.InOrder, new InOrderTreeTraversal());
        treeTraversalMap.put(TraversalType.PostOrder, new PostOrderTreeTraversal());

        TreeNode tempRoot = new TreeNode("F");

        tempRoot.setLeft(new TreeNode("B"));
        tempRoot.setRight(new TreeNode("G"));

        TreeNode temp = tempRoot.getLeft();
        temp.setLeft(new TreeNode("A"));
        temp.setRight(new TreeNode("D"));

        temp = temp.getRight();
        temp.setLeft(new TreeNode("C"));
        temp.setRight(new TreeNode("E"));

        temp = tempRoot.getRight();
        temp.setRight(new TreeNode("I"));

        temp = temp.getRight();
        temp.setLeft(new TreeNode("H"));

        root = tempRoot;

        traversalSolutionMap = new HashMap<TraversalType, String>();
        traversalSolutionMap.put(TraversalType.PreOrder, "FBADCEGIH");
        traversalSolutionMap.put(TraversalType.InOrder,  "ABCDEFGHI");
        traversalSolutionMap.put(TraversalType.PostOrder,"ACEDBHIGF");
    }

    @Test
    public void testPreOrderBaseCaseIterative() {

        List l = treeTraversalMap.get(TraversalType.PreOrder).iterativeTraversal(null);
        assertEquals(true, l.isEmpty());

    }

    @Test
    public void testPreOrderIterative() {
        List<Node> l = treeTraversalMap.get(TraversalType.PreOrder).iterativeTraversal(root);
        assertEquals(traversalSolutionMap.get(TraversalType.PreOrder), convertNodeToString(l));

    }


    @Test
    public void testPreOrderBaseCaseRecursive() {
        List<Node> l = treeTraversalMap.get(TraversalType.PreOrder).recursiveTraversal(null);
        assertEquals(true, l.isEmpty());
    }

    @Test
    public void testPreOrderRecursive() {
        List<Node> l = treeTraversalMap.get(TraversalType.PreOrder).recursiveTraversal(root);
        assertEquals(traversalSolutionMap.get(TraversalType.PreOrder), convertNodeToString(l));
    }

    @Test
    public void testInOrderBaseCaseIterative() {
        List<Node> l = treeTraversalMap.get(TraversalType.InOrder).recursiveTraversal(null);
        assertEquals(true, l.isEmpty());
    }

    @Test
    public void testInOrderIterative() {
        List<Node> l = treeTraversalMap.get(TraversalType.InOrder).recursiveTraversal(root);
        assertEquals(traversalSolutionMap.get(TraversalType.InOrder), convertNodeToString(l));
    }

    @Test
    public void testInOrderBaseCaseRecursive() {
        List<Node> l = treeTraversalMap.get(TraversalType.InOrder).recursiveTraversal(null);
        assertEquals(true, l.isEmpty());
    }
    @Test
    public void testInOrderRecursive() {
        List<Node> l = treeTraversalMap.get(TraversalType.InOrder).recursiveTraversal(root);
        assertEquals(traversalSolutionMap.get(TraversalType.InOrder), convertNodeToString(l));
    }

    @Test
    public void testPostOrderBaseCaseRecursive() {
        List<Node> l = treeTraversalMap.get(TraversalType.InOrder).recursiveTraversal(null);
        assertEquals(true, l.isEmpty());
    }
    @Test
    public void testPostOrderRecursive() {
        List<Node> l = treeTraversalMap.get(TraversalType.PostOrder).recursiveTraversal(root);
        assertEquals(traversalSolutionMap.get(TraversalType.PostOrder), convertNodeToString(l));
    }

    @Test
    public void testPostOrderIterative() {
        List<Node> l = treeTraversalMap.get(TraversalType.PostOrder).recursiveTraversal(root);
        assertEquals(traversalSolutionMap.get(TraversalType.PostOrder), convertNodeToString(l));
    }

    private String convertNodeToString(List<Node> l) {

        if (l == null || l.isEmpty()) return "";
        StringBuilder s = new StringBuilder();
        for (Node n : l) {
            if (n != null && n.getVal() != null) s.append(n.getVal().toString());
        }
        return s.toString();
    }

}

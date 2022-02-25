package com.place.yao.code.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 深拷贝连通无向图（https://leetcode.com/problems/clone-graph/）
 * @Author vectoryao
 * @Date 2022/2/23
 **/
public class M_133_CloneGraph {

    // Definition for a Node.
    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    private static Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        List<Node> list = new ArrayList<>();
        return cloneGraph(node, list);
    }

    private static Node cloneGraph(Node node, List<Node> list) {
        if (node == null) {
            return null;
        }
        for (Node n : list) {
            if (n.val == node.val) {
                return n;
            }
        }

        Node clone = new Node(node.val);
        list.add(clone);
        for (Node n : node.neighbors) {
            clone.neighbors.add(cloneGraph(n, list));
        }
        return clone;
    }


    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        Node clone = cloneGraph(node1);
        System.out.println(clone);
    }

}


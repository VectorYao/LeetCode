package com.place.yao.code.Medium;

/**
 * @Description 根据前序和中序遍历结果，重建二叉树（https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/）
 * @Author vectoryao
 * @Date 2022/3/1
 **/
public class M_105_ConstructBinaryTreePreorderInorderTraversal {

    // Definition for a binary tree node.
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);
        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                inIndex = i;
                break;
            }
        }
        root.left = buildTree(preorder, preStart + 1, preStart + inIndex - inStart, inorder, inStart, inIndex - 1);
        root.right = buildTree(preorder, preStart + inIndex - inStart + 1, preEnd, inorder, inIndex + 1, inEnd);
        return root;
    }

    public static void main(String[] args) {
        M_105_ConstructBinaryTreePreorderInorderTraversal solution = new M_105_ConstructBinaryTreePreorderInorderTraversal();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = solution.buildTree(preorder, inorder);
        System.out.println(root.val);
    }
}

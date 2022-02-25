package com.place.yao.code.Medium;

/**
 * @Description 排序链表（https://leetcode.com/problems/sort-list/）
 * @Author vectoryao
 * @Date 2022/2/25
 **/
public class M_148_SortList {

    //Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    //归并排序
    private ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode pre = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (pre != null) {
            pre.next = null;
        }

        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return merge(left, right);


    }

    private ListNode merge(ListNode left, ListNode right) {
        if (left == null) return right;

        if (right == null) return left;

        if (left.val < right.val) {
            left.next = merge(left.next, right);
            return left;
        }

        right.next = merge(left, right.next);
        return right;
    }

    public static void main(String[] args) {
        M_148_SortList sortList = new M_148_SortList();
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        ListNode listNode = sortList.sortList(head);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}

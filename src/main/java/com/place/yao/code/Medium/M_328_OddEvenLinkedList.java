package com.place.yao.code.Medium;

/**
 * @Description 奇偶链表
 * @Author vectoryao
 * @Date 2022/2/28
 **/
public class M_328_OddEvenLinkedList {
    // Definition for singly-linked list.
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

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode oddNode = head;
        ListNode evenNode = head.next;
        ListNode evenHead = evenNode;
        while (evenNode != null && evenNode.next != null) {
            oddNode.next = evenNode.next;
            oddNode = oddNode.next;
            evenNode.next = oddNode.next;
            evenNode = evenNode.next;
        }

        oddNode.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        M_328_OddEvenLinkedList m328OddEvenLinkedList = new M_328_OddEvenLinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = m328OddEvenLinkedList.oddEvenList(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}

package recursion;

import common.ListNode;

public class ReverseListNode {
    public static void main(String[] args) {
        ListNode listNode4 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        ListNode listNode = reverseListNodes(listNode1);

        while (listNode != null) {
            System.out.println(listNode);
            listNode = listNode.next;
        }
    }

    public static ListNode reverseListNodes(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseListNodes(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}

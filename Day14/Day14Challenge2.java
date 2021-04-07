

/*
https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/589/week-2-march-8th-march-14th/3671/
You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from
the end (the list is 1-indexed).
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Daya14Challenge2{
    public ListNode swapNodes(ListNode head, int k) {
        ListNode node1 = head, node2 = head, Knode;
        for (int i = 1; i < k; i++) node1 = node1.next;
        Knode = node1;
        node1 = node1.next;
        while (node1 != null) {
            node1 = node1.next;
            node2 = node2.next;
        }
        int temp =  Knode.val;
        Knode.val = node2.val;
        node2.val = temp;
        return head;
    }
}
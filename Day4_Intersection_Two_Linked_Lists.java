//https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3660/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Day4_Intersection_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        while(headB != null){ // While loop to start comparing the linkedlist values
            ListNode check = headA;
            while(check != null){
                if(check == headB){
                    return headB; // return the headB value if the condition is true
                }
                check = check.next; //move to the next node of the headA
            }
            headB = headB.next; // move to the next node of headB
        }
        return null; //return null value if the linked list doesn't intersect
    }
}
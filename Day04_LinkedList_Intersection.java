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
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        
        HashSet<ListNode> newSet = new HashSet<>();
        
        ListNode tempA = headA;
        
        while(tempA != null){
            newSet.add(tempA);
            tempA = tempA.next;
        }
        
        ListNode tempB = headB;
        
        while(tempB != null){
            if(newSet.contains(tempB)){
                return tempB;
                
            }
            tempB = tempB.next;
        }
        return null;
    }   
}
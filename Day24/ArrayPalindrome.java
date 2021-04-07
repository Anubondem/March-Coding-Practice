
/*Link to challenge: https://leetcode.com/explore/featured/card/april-leetcoding-challenge-2021/593/week-1-april-1st-april-7th/3693/
*/
/**

Problem; 
Given the head of a singly linked list, return true if it is a palindrome.


 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ArrayPalindrome {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack=new Stack<ListNode>();
        ListNode curr=head;
        while(curr !=null){
            stack.push(curr);
            curr=curr.next;
        }
        
        while(head !=null){
            ListNode thisNode=stack.pop();
            if(head.val != thisNode.val){
                return false;
            }
            head=head.next;
        }
        return true;
    }
}
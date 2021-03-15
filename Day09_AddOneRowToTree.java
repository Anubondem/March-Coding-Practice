

// Question: https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/589/week-2-march-8th-march-14th/3666/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        
        if(d == 1){ //base case when depth is 1
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        int currentDepth = 1;
        while(currentDepth < d-1){
            Queue<TreeNode> temp = new LinkedList<>();
            while(!q.isEmpty()){
                TreeNode curr = q.remove();
                if(curr.left != null) temp.add(curr.left);
                if(curr.right != null) temp.add(curr.right);
            }
            currentDepth++;
            q = temp;
        }
        while(!q.isEmpty()){
            TreeNode node = q.remove(); //stores node that is removed from the queue to node
            TreeNode temp = node.left; // attaches the left of that node to a temporary variable temp
            node.left = new TreeNode(v); //attaches a new node v to the left of the node
            node.left.left = temp; // Attaches the left of node left back to the temporary variable temp
            temp = node.right;
            node.right = new TreeNode(v);
            node.right.right = temp;
        }
        
        return root;
        
        
        
        
        
    }
}
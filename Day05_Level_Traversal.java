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
    public List<Double> averageOfLevels(TreeNode root) {
        
       //Creates a queue q
        Queue<TreeNode> q = new LinkedList<>();
        
        //Creates a list to store the result
        List<Double> result = new ArrayList<>();
        
        //Adds the root of the tree to the queue
        q.add(root);
        
        //Checks if queue is not empty 
        while(!q.isEmpty()){
            int size = q.size(); // Adds the size of each level to the variable size
            long sum = 0;
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll(); //removes the element at the front of the queue and stores it in the variable curr (Dequeues the queue)
                
                sum+=curr.val; //computes the sum at each level
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            result.add((double)sum/size); // computes the average at aech level
        }
        return result;
    }
   
}
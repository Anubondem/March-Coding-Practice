//https://leetcode.com/explore/featured/card/march-leetcoding-challenge-2021/588/week-1-march-1st-march-7th/3661/


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
class Day5_Average_of-Levels_in_Binary_Tree {
    public List<Double> averageOfLevels(TreeNode root) {
        
        List < Double > results = new ArrayList < > (); // arraylist to take the results
        Queue < TreeNode > queue = new LinkedList < > (); //queue to check for the Nodes
        
        queue.add(root);
        
        while (!queue.isEmpty()) {
            int sum = 0, countchildren = 0;
            Queue < TreeNode > template = new LinkedList < > ();
            while (!queue.isEmpty()) {
                TreeNode number = queue.remove(); 
                sum =sum+ number.val;
                countchildren++;
                
                if (number.left != null){
                    template.add(number.left);
                }
                
                if (number.right != null){
                    template.add(number.right);
                }
            }
            queue = template; // this line helps to check for the next parent Node
            results.add(sum*1.0/ countchildren); // multiplying by 1.0 to make results double
        }
        return results;
    }
}
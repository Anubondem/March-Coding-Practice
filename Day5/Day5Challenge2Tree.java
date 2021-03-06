// Java program to find averages of all levels
// in a binary tree.
import java.util.*;
import java.util.LinkedList;

class Day5Challenge2Tree {


    /* A binary tree node has data, pointer to
    left child and a pointer to right child */
    static class Node {
        int val;
        Node left, right;
    }

    /* Function to print the average value of the
    nodes on each level */

    /*public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        ArrayList<TreeNode> qw = new ArrayList<>();
        qw.add(root);
        while (!qw.isEmpty()) {
            int size = qw.size();
            long sum = 0;
            for (int i = 0; i < size; ++i) {
                root = qw.remove(0);
                sum += root.val;
                if (root.left != null) {
                    qw.add(root.left);
                }
                if (root.right != null) {
                    qw.add(root.right);
                }
            }
            res.add(sum / (double)size);
        }
        return res;
    }
}*/
    static void averageOfLevels(Node root)
    {
        //vector<float> res;

        // Traversing level by level
        Queue<Node> queue = new LinkedList<>();
        LinkedList list=new LinkedList();
        queue.add(root);
        long sum = 0, count  = 0;

        while (!queue.isEmpty()) {

            // Compute sum of nodes and
            // count of nodes in current
            // level.
            sum = 0;
            count = 0;
            Queue<Node> tempQueue = new LinkedList<> ();
            while (!queue.isEmpty()) {
                Node node = queue.peek();
                queue.remove();
                sum += node.val;
                count++;
                if (node.left != null)
                    tempQueue.add(node.left);
                if (node.right != null)
                    tempQueue.add(node.right);
            }
            queue = tempQueue;
            double levelAvverage=(sum*1.0/count);
            list.add(levelAvverage);
            System.out.print((sum * 1.0 / count) + " ");

        }
    }

    /* Helper function that allocates a
    new node with the given data and
    NULL left and right pointers. */
    static Node newNode(int data)
    {
        Node temp = new Node();
        temp.val = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    // Driver code
    public static void main(String[] args)
    {
    /* Let us construct a Binary Tree
        4
    / \
    2 9
    / \ \
    3 5 7 */

        Node root = null;
        root = newNode(2147483647);
        root.left = newNode(2147483647);
        root.right = newNode(2147483647);
       /* root.left.left = newNode(3);
        root.left.right = newNode(5);
        root.right.right = newNode(7);*/
        System.out.println("Averages of levels : ");
        System.out.print("[");
        averageOfLevels(root);
        System.out.println("]");
    }
}

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
 *//*
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        // Traversing level by level
        //queue to store node values
        Queue<TreeNode> queue = new LinkedList<>();

        // list to store levels average
        LinkedList list=new LinkedList();
        queue.add(root);
        long sum = 0, count  = 0;

        while (!queue.isEmpty()) {

            //find sum of nodes and count to obtain average
            sum = 0;
            count = 0;
            Queue<TreeNode> tempQueue = new LinkedList<> ();
            while (!queue.isEmpty()) {
                TreeNode node = queue.peek();
                queue.remove();
                sum += node.val;
                count++;
                if (node.left != null)
                    tempQueue.add(node.left);
                if (node.right != null)
                    tempQueue.add(node.right);


            }
            queue = tempQueue;
            double levelAverage=(sum*1.0/count);
            list.add(levelAverage);


        }
        return list;
    }
}
 */
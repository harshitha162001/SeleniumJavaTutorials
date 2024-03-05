package javaprograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
 
// TreeNode class represents a node in the binary tree
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
 
    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
 
// RightViewBinaryTree class contains the method to find the right view of the binary tree
public class RightViewBinaryTree {
    
    // Method to find the right view of the binary tree
    public static List<Integer> rightView(TreeNode root) {
        List<Integer> rightViewList = new ArrayList<>();
 
        // Check if the tree is empty
        if (root == null) {
            return rightViewList;
        }
 
        Queue<TreeNode> queue = new LinkedList<>();//it creates a queue using linked list class
        queue.add(root);//1
 
        // Perform level-order traversal (BFS)
        while (!queue.isEmpty()) {
            int levelSize = queue.size();//size of the element 
 
            // Traverse each level
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();//current =1
 
                // Rightmost node at each level is added to the result list
                if (i == levelSize - 1) {
                    rightViewList.add(current.value);
                }
 
                // Enqueue left and right children if they exist
                if (current.left != null) {
                    queue.add(current.left);
                }
 
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
 
        return rightViewList;
    }
 
    // Main method for example usage
    public static void main(String[] args) {
        // Example usage:
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
 
        // Get the right view and print the result
        List<Integer> rightViewResult = rightView(root);
        System.out.println("Right View of Binary Tree: " + rightViewResult);
    }
}


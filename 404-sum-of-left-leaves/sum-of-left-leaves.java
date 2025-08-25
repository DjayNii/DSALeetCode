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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        int total = 0;

        // check if left child is a leaf
        if (root.left != null && root.left.left == null && root.left.right == null) {
            total += root.left.val;
        }

        // recurse on both sides
        total += sumOfLeftLeaves(root.left);
        total += sumOfLeftLeaves(root.right);

        return total;
    }
}
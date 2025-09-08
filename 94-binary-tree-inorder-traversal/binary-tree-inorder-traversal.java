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
    void inOrder (TreeNode node,ArrayList<Integer> result){
        if (node == null){
            return;
        }
        inOrder(node.left, result);
        result.add(node.val);
        inOrder(node.right, result);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> traversal = new ArrayList<>();

        inOrder(root,traversal);

        return traversal ;
    }
}
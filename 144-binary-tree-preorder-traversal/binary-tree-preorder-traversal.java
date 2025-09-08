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
    void preorder (TreeNode node,ArrayList<Integer> result){
        if (node == null){
            return;
        }
        result.add(node.val);
        preorder(node.left, result);
        preorder(node.right, result);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
       ArrayList<Integer> traversal = new ArrayList<>();

        preorder(root,traversal);

        return traversal ;
    }
}
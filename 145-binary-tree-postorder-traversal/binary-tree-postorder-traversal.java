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
    public void postOrder(TreeNode node,ArrayList<Integer> result){
        if(node == null){
            return;
        }
        postOrder(node.left,result);
        postOrder(node.right,result);
        result.add(node.val);
    } 
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> traversalResult = new ArrayList<Integer>();

        postOrder(root,traversalResult);

        return traversalResult;
    }
}
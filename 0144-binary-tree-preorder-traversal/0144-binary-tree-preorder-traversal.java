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
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        travel(root,ans);
        return ans;
    }
    public void travel(TreeNode root, ArrayList<Integer> ans){
        if(root == null) return;
        ans.add(root.val); 
        travel(root.left,ans);
        travel(root.right,ans);
    }
}
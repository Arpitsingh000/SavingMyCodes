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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> arr = new ArrayList<List<Integer>>();
        dfs(arr, root, 0);
        for (int i = 1; i < arr.size(); i += 2) {
            Collections.reverse(arr.get(i));
        }
        return arr;
    }

    public void dfs(List<List<Integer>> arr, TreeNode node, int depth) {
        if (node == null) return;
        if (arr.size() == depth) {
            arr.add(new ArrayList<>());
        }
        List<Integer> list = arr.get(depth);
        list.add(node.val);
        dfs(arr, node.left, depth + 1);
        dfs(arr, node.right, depth + 1);
    }
}
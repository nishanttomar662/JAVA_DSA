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
    public int findSecondMinimumValue(TreeNode root) {
        long ans = helper(root, root.val);
        return ans == Long.MAX_VALUE ? -1 : (int) ans;
    }

    private long helper(TreeNode node, int min) {
        if (node == null) return Long.MAX_VALUE;

        // If we found a value greater than min, return it
        if (node.val > min) return node.val;

        long left = helper(node.left, min);
        long right = helper(node.right, min);

        return Math.min(left, right);
    }
    }
    

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//Leetcode104 求二叉树的深度
public class Solution3 {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        else{
            int left = maxDepth(root.left)+1;
            int right = maxDepth(root.right)+1;
            return left>right?left:right;
        }
    }
}

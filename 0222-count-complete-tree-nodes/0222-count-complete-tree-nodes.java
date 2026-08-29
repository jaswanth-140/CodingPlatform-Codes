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
    public int countNodes(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null&&root.right==null)
        {
            return 1;
        }

        int lc=0;
        int rc=0;

        TreeNode temp=root;
        while(temp!=null)
        {
            lc++;
            temp=temp.left;
        }
        temp=root;
        while(temp!=null)
        {
            rc++;
            temp=temp.right;
        }

        if(lc==rc)
        {
            return (1<<lc)-1;
        }

        int leftcount=countNodes(root.left);
        int rightcount=countNodes(root.right);
        return 1+leftcount+rightcount;
    }
}
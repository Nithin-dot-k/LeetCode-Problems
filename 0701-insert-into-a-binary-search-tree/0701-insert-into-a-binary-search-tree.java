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
    public void insert(TreeNode root,int val){
        if(val<root.val){
            if(root.left==null){
                TreeNode temp=new TreeNode(val);
                root.left=temp;
                return;
            }
            else insert(root.left,val);
        }
        else{
            if(root.right==null){
                TreeNode temp=new TreeNode(val);
                root.right=temp;
                return;
            }
            else insert(root.right,val);
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            TreeNode temp=new TreeNode(val);
            return temp;
        }
        insert(root,val);
        return root;
    }
}
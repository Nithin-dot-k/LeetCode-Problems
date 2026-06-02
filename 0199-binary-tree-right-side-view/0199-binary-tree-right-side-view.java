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
    List<Integer> li;
    public void add(TreeNode root,int cnt){
        if(root==null) return;
        if(li.size()==cnt){
            li.add(root.val);
        }
        add(root.right,cnt+1);
        add(root.left,cnt+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        li=new ArrayList<>();
        add(root,0);
        return li;
    }
}
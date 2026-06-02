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
        List<List<Integer>> li=new ArrayList<>();
        if(root==null) return li;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int j=0;
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode x=q.poll();
                if(j%2==0)
                l.add(x.val);
                else l.add(0,x.val);
                if(x.left!=null) q.add(x.left);
                if(x.right!=null) q.add(x.right);
            }
            li.add(l);
            j++;
        }
        return li;
    }
}
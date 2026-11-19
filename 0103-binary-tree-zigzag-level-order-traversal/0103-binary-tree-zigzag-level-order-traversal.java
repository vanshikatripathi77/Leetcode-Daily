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
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        int ct=0;
        while(!q.isEmpty()){
            ct++;
            int size=q.size();
            List<Integer> lis=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                lis.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            if(ct%2==0){
                Collections.reverse(lis);
            }
            res.add(lis);
        }
        return res;
    }
}
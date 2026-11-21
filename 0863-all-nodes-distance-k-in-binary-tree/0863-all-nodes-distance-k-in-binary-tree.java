/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Pair{
    TreeNode first;
    int second;
    public Pair(TreeNode first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Queue<TreeNode> pq=new LinkedList<>();
        pq.add(root);
        HashMap<TreeNode,TreeNode> parent=new HashMap<>();
        while(!pq.isEmpty()){
            int size=pq.size();
            for(int i=0;i<size;i++){
                TreeNode curr=pq.poll();
                if(curr.left!=null){
                    parent.put(curr.left,curr);
                    pq.add(curr.left);
                }
                if(curr.right!=null){
                    parent.put(curr.right,curr);
                    pq.add(curr.right);
                }
            }
        }

        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        HashSet<TreeNode> visited=new HashSet<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(target,0));
        visited.add(target);
        while(!q.isEmpty()){
            Pair curr=q.poll();
                TreeNode first=curr.first;
                int second=curr.second;
                if(second==k){
                    res.add(first.val);
                    continue;
                }
                if(first.left!=null && !visited.contains(first.left)){
                    q.add(new Pair(first.left,second+1));
                    visited.add(first.left);
                }
                if(first.right!=null && !visited.contains(first.right)){
                    q.add(new Pair(first.right,second+1));
                    visited.add(first.right);
                }
                TreeNode p=parent.get(first);
                if(p!=null && !visited.contains(p)){
                    q.add(new Pair(p,second+1));
                    visited.add(p);
                }
        }
        return res;
    }
}
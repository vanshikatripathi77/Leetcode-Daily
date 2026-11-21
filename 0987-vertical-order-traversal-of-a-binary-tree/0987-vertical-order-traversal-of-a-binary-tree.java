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
class Pair{
    TreeNode node;
    int vlevel;
    int hlevel;
    public Pair(TreeNode node,int vlevel,int hlevel){
        this.node=node;
        this.vlevel=vlevel;
        this.hlevel=hlevel;
    }
} 
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> hp=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0,0));
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair curr=q.poll();
                TreeNode node=curr.node;
                int vlevel=curr.vlevel;
                int hlevel=curr.hlevel;
                hp.putIfAbsent(vlevel,new TreeMap<>());
                hp.get(vlevel).putIfAbsent(hlevel,new PriorityQueue<>());
                hp.get(vlevel).get(hlevel).add(node.val);
                if(node.left!=null){
                    q.add(new Pair(node.left,vlevel-1,hlevel+1));
                }
                if(node.right!=null){
                    q.add(new Pair(node.right,vlevel+1,hlevel+1));
                }
            }
        }
        List<List<Integer>> result=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> entry:hp.values()){
            List<Integer> res=new ArrayList<>();
            for(PriorityQueue<Integer> pq:entry.values()){
                while(!pq.isEmpty()){
                    res.add(pq.poll());
                }
            }
            result.add(res);
        }
        return result;
    }
}
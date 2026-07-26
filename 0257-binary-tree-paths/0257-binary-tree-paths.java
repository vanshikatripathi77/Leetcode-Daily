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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<>();
        String str="";
        f(root,str,result);
        return result;
    }
    public void f(TreeNode root,String str,List<String> result){
        if(root==null){
            return;
        }
        str+=root.val;
        if(root.left==null && root.right==null){
            result.add(str);
        }
        else{
            str+="->";
        }
        f(root.left,str,result);
        f(root.right,str,result);
        if(str.length()>=2){
            str=str.substring(0,str.length()-2);
        }
    }
}
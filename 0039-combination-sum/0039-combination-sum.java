class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        f(0,target,candidates,res,new ArrayList<>());
        return res;
    }
    public void f(int index,int target,int[] candidates,List<List<Integer>> res,List<Integer> arr){
        if(index==candidates.length){
            if(target==0){
                res.add(new ArrayList<>(arr));
            }
            return;
        }
        if(target>=candidates[index]){
            arr.add(candidates[index]);
            f(index,target-candidates[index],candidates,res,arr);
            arr.remove(arr.size()-1);
        }
        f(index+1,target,candidates,res,arr);
    }
}
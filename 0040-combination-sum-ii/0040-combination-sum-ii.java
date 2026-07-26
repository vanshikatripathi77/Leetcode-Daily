class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> res=new ArrayList<>();
       HashSet<List<Integer>> set=new HashSet<>();
       Arrays.sort(candidates);
       f(0,candidates,target,res,set,new ArrayList<>());
       return res;
    }
    public void f(int i,int[] candidates,int target,List<List<Integer>> res,HashSet<List<Integer>> hp,List<Integer> arr){
        if(target==0){
            if(!hp.contains(arr)){
                res.add(new ArrayList<>(arr));
                hp.add(new ArrayList<>(arr));
            }
            return;    
        }
        for(int idx=i;idx<candidates.length;idx++){
            if(idx>i && candidates[idx-1]==candidates[idx]){
                continue;
            }
            if(target>=candidates[idx]){
                arr.add(candidates[idx]);
                f(idx+1,candidates,target-candidates[idx],res,hp,arr);
                arr.remove(arr.size()-1);
            }
        }
    }
}
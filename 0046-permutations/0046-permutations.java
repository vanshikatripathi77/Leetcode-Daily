class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        HashSet<List<Integer>> hp=new HashSet<>();
        f(0,nums,res,hp);
        return res;
    }
    public void f(int idx,int[] nums,List<List<Integer>> res,HashSet<List<Integer>> hp){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        if(!hp.contains(list)){
            hp.add(list);
            res.add(list);
        }
        for(int i=idx;i<nums.length;i++){
            swap(i,idx,nums);
            f(idx+1,nums,res,hp);
            swap(i,idx,nums);
        }
    }
    public void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
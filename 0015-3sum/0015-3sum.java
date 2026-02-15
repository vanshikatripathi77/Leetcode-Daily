class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int target=-nums[i];
            func(i+1,nums.length-1,nums,target,res);
        }
        return res;
    }
    public void func(int i,int j,int[] nums,int target,List<List<Integer>> res){
    
        while(i<j){
            if(nums[i]+nums[j] >target){
                j--;
            }
            else if(nums[i]+nums[j] <target){
                i++;
            }
            else{
                while(i<j && nums[i]==nums[i+1]) i++;

                while(i<j && nums[j]==nums[j-1]) j--;
                List<Integer> lis=new ArrayList<>();
                lis.add(-target);
                lis.add(nums[i]);
                lis.add(nums[j]);
                res.add(lis);
                i++;
                j--;
            }
        }
    }
}
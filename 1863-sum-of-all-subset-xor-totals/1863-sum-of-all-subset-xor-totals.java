class Solution {
    public int subsetXORSum(int[] nums) {
        int[] ans=new int[1];
        ans[0]=0;
        f(0,nums,new ArrayList<>(),ans);
        return ans[0];
    }
    public void f(int i,int[] nums,List<Integer> arr,int[] ans){
        if(i==nums.length){
            int xor=0;
            for(int x:arr){
                xor^=x;
            }
            ans[0]+=xor;
            return;
        }
        arr.add(nums[i]);
        f(i+1,nums,arr,ans);
        arr.remove(arr.size()-1);
        f(i+1,nums,arr,ans);
    }
}
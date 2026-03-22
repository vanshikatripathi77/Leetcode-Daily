class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero=0;
        int i=0,j=0;
        int ans=Integer.MIN_VALUE;
        while(j<nums.length){
            int x=nums[j];
            if(x==0){
                zero++;
            }
            while(zero>k){
                if(nums[i]==0){
                    zero--;
                }
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        if(ans==Integer.MIN_VALUE){
            return 0;
        }
        return ans;
    }
}
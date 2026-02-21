class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<n-2;i++){
            int j=i+1,k=n-1;
            while(j<k){
                if((nums[i]+nums[j]+nums[k])<target){
                    if(Math.abs(target-(nums[i]+nums[j]+nums[k]))<res){
                        res=Math.min(res,Math.abs(target-(nums[i]+nums[j]+nums[k])));
                        ans=nums[i]+nums[j]+nums[k];
                    }
                    j++;
                }
                else{
                    if(Math.abs(target-(nums[i]+nums[j]+nums[k]))<res){
                        res=Math.min(res,Math.abs(target-(nums[i]+nums[j]+nums[k])));
                        ans=nums[i]+nums[j]+nums[k];
                    }
                    k--;
                }
            }
        }
        return ans;
    }
}
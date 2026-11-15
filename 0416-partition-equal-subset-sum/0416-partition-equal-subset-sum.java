class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i:nums){
            s+=i;
        }
        if(s%2!=0){
            return false;
        }
        s=s/2;
        Boolean[][] dp=new Boolean[n+1][s+1];
        return f(0,s,nums,n,dp);
    }
    public boolean f(int i,int s,int[] nums,int n,Boolean[][] dp){
        if(s==0){
            return true;
        }
        if(i==n){
            if(s==0){
                return true;
            }
            else {
                return false;
            }
        }
        if(dp[i][s]!=null){
            return dp[i][s];
        }
        boolean nontake=f(i+1,s,nums,n,dp);
        boolean take=false;
        if(s>=nums[i]){
            take=f(i+1,s-nums[i],nums,n,dp);
        }
        return dp[i][s]=nontake||take;

    }
}
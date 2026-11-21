class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        if(sum%2!=0){
            return false;
        }
        sum=sum/2;
        int n=nums.length;
        Boolean[][] dp=new Boolean[n][sum+1];
        return f(n-1,sum,nums,dp);
    }
    public boolean f(int i,int k,int[] nums,Boolean[][] dp){
        if(k==0){
            return true;
        }
        if(i==0){
            return nums[0]==k;
        }
        if(dp[i][k]!=null){
            return dp[i][k];
        }
        boolean nontake=f(i-1,k,nums,dp);
        boolean take=false;
        if(k>=nums[i]){
            take=f(i-1,k-nums[i],nums,dp);
        }
        return dp[i][k]=nontake || take;
    }
}
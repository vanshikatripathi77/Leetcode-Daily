class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n][m];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return f(n-1,m-1,text1,text2,dp);
    }
    public int f(int i,int j,String test1,String test2,int[][] dp){
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(test1.charAt(i)==test2.charAt(j)){
            return dp[i][j]=1+f(i-1,j-1,test1,test2,dp);
        }
        return dp[i][j]=Math.max(f(i-1,j,test1,test2,dp),f(i,j-1,test1,test2,dp));
    }
}
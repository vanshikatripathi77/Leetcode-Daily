class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int[][] res=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[i][j]=image[i][j];
            }
        }
        dfs(sr,sc,image,res,color,n,m,sr,sc);
        return res;
    }
    public void dfs(int i,int j,int[][] image,int[][] res,int color,int n,int m,int sr,int sc){
        if(i<0 || j<0 || i>=n || j>=m || image[i][j]!=image[sr][sc] || res[i][j]==color){
            return;
        }
        res[i][j]=color;
        dfs(i-1,j,image,res,color,n,m,sr,sc);
        dfs(i+1,j,image,res,color,n,m,sr,sc);
        dfs(i,j-1,image,res,color,n,m,sr,sc);
        dfs(i,j+1,image,res,color,n,m,sr,sc);
    }
}
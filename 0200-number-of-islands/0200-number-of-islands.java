class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visited=new boolean[n][m];
        int ct=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    dfs(i,j,grid,visited,n,m);
                    ct++;
                }
            }
        }
        return ct;
    }
    public void dfs(int i,int j,char[][] grid,boolean[][] visited,int n,int m){
        if(i<0 || j<0 || i>=n || j>=m || visited[i][j]==true || grid[i][j]=='0'){
            return;
        }
        visited[i][j]=true;
        dfs(i-1,j,grid,visited,n,m);
        dfs(i+1,j,grid,visited,n,m);
        dfs(i,j-1,grid,visited,n,m);
        dfs(i,j+1,grid,visited,n,m);
    }
}
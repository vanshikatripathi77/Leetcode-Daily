class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
} 
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        int two=0;
        int one=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j));
                    vis[i][j]=true;
                    two++;
                }
                if(grid[i][j]==1){
                    one++;
                }
            }
        }
        if(one==0){
            return 0;
        }
        else if(two==0){
            return -1;
        }
        int ct=0;
        int[] row={0,1,-1,0};
        int[] col={1,0,0,-1};
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair curr=q.poll();
                int first=curr.first;
                int second=curr.second;
                for(int j=0;j<4;j++){
                    int newfirst=first+row[j];
                    int newsecond=second+col[j];
                    System.out.println(newfirst);
                    System.out.println(newsecond);
                    if(newfirst>=0 && newfirst<n && newsecond>=0 && newsecond<m && vis[newfirst][newsecond]==false && grid[newfirst][newsecond]==1){
        
                        vis[newfirst][newsecond]=true;
                        q.add(new Pair(newfirst,newsecond));
                    }
                }
            }
            ct++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]==false){
                    return -1;
                }
            }
        }
        return ct-1;
    }
}
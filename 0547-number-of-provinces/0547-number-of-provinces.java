class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && isConnected[i][j]==1){
                    adj.get(i).add(j);
                }
            }
        }
        int ct=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]!=true){
                dfs(i,adj,visited);
                ct++;
            }
        }
        return ct;
    }
    public void dfs(int i,List<List<Integer>> adj,boolean[] visited){
       visited[i]=true;
       for(int x:adj.get(i)){
        if(visited[x]!=true){
            dfs(x,adj,visited);
        }
       }
    }
}
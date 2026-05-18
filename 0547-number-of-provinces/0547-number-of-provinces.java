class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        } 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                }
            }
        }
        int ct=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                ct++;
                dfs(i,adj,visited);
            }
        } 
        return ct;    
    }
    public void dfs(int i,ArrayList<ArrayList<Integer>> adj,boolean[] visited){
        visited[i]=true;
        for(int x:adj.get(i)){
            if(!visited[x]){
                dfs(x,adj,visited);
            }
        }
    }
}
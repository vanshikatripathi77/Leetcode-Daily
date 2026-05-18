class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=isConnected.length;
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
                bfs(i,adj,visited);
            }
        }
        return ct++;
    }
    public void bfs(int i,ArrayList<ArrayList<Integer>> adj,boolean[] visited){
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int curr=q.poll();
            visited[curr]=true;
            for(int x:adj.get(curr)){
                if(!visited[x]){
                    q.add(x);
                    visited[x]=true;
                }
            }
        }
    }
}
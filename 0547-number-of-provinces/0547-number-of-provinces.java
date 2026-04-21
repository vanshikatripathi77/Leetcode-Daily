class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j]==1 && i!=j ){
                    adj.get(i).add(j);
                }
            }
        }
        Queue<Integer> q=new LinkedList<>();
        int ct=0;
        boolean[] vis=new boolean[n+1];
        for(int i=0;i<n;i++){
            ct++;
            vis[i]=true;
            q.add(i);
            while(!q.isEmpty()){
                int x=q.poll();
                vis[x]=true;
                for(int j:adj.get(x)){
                    if(!vis[j]){
                        vis[j]=true;
                        q.add(j);
                    }
                }
            }
        }
        return ct;
    }
}
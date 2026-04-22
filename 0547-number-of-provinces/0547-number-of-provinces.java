class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                }
            }
        }
        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[n];
        int ct=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                ct++;
                q.add(i);
                while(!q.isEmpty()){
                    int curr=q.poll();
                    vis[i]=true;
                    for(int x:adj.get(curr)){
                        if(!vis[x]){
                            vis[x]=true;
                            q.add(x);
                        }
                    }
                }
            }
        }
        return ct;
    }
}
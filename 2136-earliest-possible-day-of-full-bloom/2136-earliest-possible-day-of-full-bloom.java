class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n=plantTime.length;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.second-a.second);
        for(int i=0;i<n;i++){
            int a=plantTime[i];
            int b=growTime[i];
            pq.add(new Pair(a,b));
        }
        int prevPlantdays=0;
        int maxbloomdays=Integer.MIN_VALUE;
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            int first=curr.first;
            int second=curr.second;
            prevPlantdays+=first;
            int currbloomdays=prevPlantdays+second;
            maxbloomdays=Math.max(maxbloomdays,currbloomdays);
        }
        return maxbloomdays;
    }
}
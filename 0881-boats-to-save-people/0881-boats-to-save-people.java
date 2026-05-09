class Solution {
    public int numRescueBoats(int[] people, int limit) {
        PriorityQueue<Integer> minq=new PriorityQueue<>();
        PriorityQueue<Integer> maxq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<people.length;i++){
            minq.add(people[i]);
            maxq.add(people[i]);
        }
        int ct=0,n=0;
        while(n<people.length){
            int limit1=limit;
            if(!maxq.isEmpty() && limit1>=maxq.peek()){
                limit1-=maxq.poll();
                n++;
                if(!maxq.isEmpty() && limit1>=maxq.peek()){
                    limit1-=maxq.poll();
                    n++;
                }
                else if(!minq.isEmpty() && limit1>=minq.peek()){
                    limit1-=minq.poll();
                    n++;
                }
            }
            else if(!minq.isEmpty() && limit1>=minq.peek()){
                limit1-=minq.poll();
                n++;
                if(!minq.isEmpty() && limit1>=minq.peek()){
                    limit1-=minq.poll();
                    n++;
                }
            }
            ct++;
        }
        return ct;
    }
}
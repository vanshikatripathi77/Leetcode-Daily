class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        PriorityQueue<Integer> minq=new PriorityQueue<>();
        PriorityQueue<Integer> maxq=new PriorityQueue<>(Collections.reverseOrder());
        for(Integer x:tokens){
            minq.add(x);
            maxq.add(x);
        }
        int max_score=0;
        int score=0;
        int c=0;
        while(c<tokens.length){
            c++;
            if(power>=minq.peek()){
                power-=minq.poll();
                score++;
            }
            else if(power<minq.peek() && score>0){
                power+=maxq.poll();
                score--;
            }
            max_score=Math.max(max_score,score);
        }
        return max_score;
    }
}
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ct=0;
        for(String str:patterns){
            if(word.indexOf(str)>=0){
                ct++;
            }
        }
        return ct;
    }
}
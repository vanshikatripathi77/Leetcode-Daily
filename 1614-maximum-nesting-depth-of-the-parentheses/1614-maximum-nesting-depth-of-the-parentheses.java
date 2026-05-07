class Solution {
    public int maxDepth(String s) {
        int open=0;
        int i=0;
        int m=Integer.MIN_VALUE;
        while(i<s.length()){
            m=Math.max(m,open);
            if(s.charAt(i)=='('){
                open++;
            }
            else if(s.charAt(i)==')'){
                open--;
            }
            i++;
        }
        return m;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hp=new HashMap<>();
        int i=0,j=0;
        int ans=Integer.MIN_VALUE;
        while(j<s.length()){
            char ch=s.charAt(j);
            hp.put(ch,hp.getOrDefault(ch,0)+1);
            while(hp.get(ch)>1){
                char a=s.charAt(i);
                if(hp.get(a)==1){
                    hp.remove(a);
                }
                else{
                    hp.put(a,hp.get(a)-1);
                }
                i++;
            }
            ans=Math.max(ans,(j-i)+1);
            j++;

        }
        if(ans==Integer.MIN_VALUE){
            return 0;
        }
        return ans;
    }
}
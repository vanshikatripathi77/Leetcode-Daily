class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int i=0,j=0;
        String res="";
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                res+=str1.charAt(i);
                i++;
                j++;
            }
            else{
                return res;
            }
        }
        return res;
    }
}
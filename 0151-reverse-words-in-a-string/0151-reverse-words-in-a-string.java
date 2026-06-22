class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        StringBuilder strnew=new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            strnew.append(str[i]);
            if(i!=0){
                strnew.append(" ");
            }
        }
        return strnew.toString();   
    }
}
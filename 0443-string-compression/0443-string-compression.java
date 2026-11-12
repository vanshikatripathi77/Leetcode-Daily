class Solution {
    public int compress(char[] chars) {
        int count=1;
        String str="";
        for(int i=1;i<chars.length;i++){
            if(chars[i-1]!=chars[i]){
                str+=chars[i-1];
                if(count!=1){
                    str+=Integer.toString(count);
                }
                count=1;
            }
            else{
                count++;
            }
        }
        str+=chars[chars.length-1];
        if(count!=1){
            str+=count;
        }
        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }
        return str.length();
    }
}
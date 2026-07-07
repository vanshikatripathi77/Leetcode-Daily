class Solution {
    public long sumAndMultiply(int n) {
        String str=Integer.toString(n);
        StringBuilder strnew=new StringBuilder();
        long sum=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0'){
                strnew.append(str.charAt(i));
                sum+=str.charAt(i)-'0';
            }
        }
        String s=strnew.toString();
        if(s.isEmpty()){
            return 0;
        }
        long num=Long.parseLong(s);
        return num*sum;
    }
}
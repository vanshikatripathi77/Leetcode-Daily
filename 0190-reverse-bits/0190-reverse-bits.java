class Solution {
    public int reverseBits(int n) {
        String str=Integer.toBinaryString(n);
        str=String.format("%32s", str).replace(' ', '0');
        System.out.println(str);
        String st="";
        for(int i=str.length()-1;i>=0;i--){
            st+=str.charAt(i);
        }
        int res=Integer.parseInt(st,2);
        return res;
    }
}
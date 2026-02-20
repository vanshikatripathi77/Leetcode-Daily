class Solution {
    public int countBinarySubstrings(String s) {
      int zeroct=0,onect=0;
      int i=0,j=1,res=0;
      if(s.charAt(0)=='0'){
        zeroct=1;
      }
      else{
        onect=1;
      }
      while(j<s.length()){
        if(s.charAt(j)!=s.charAt(j-1)){
            if(s.charAt(j)=='0' && zeroct!=0){
                res+=Math.min(zeroct,onect);
                while(zeroct!=0){
                    zeroct--;
                    i++;
                }    
            }
            if(s.charAt(j)=='1' && onect!=0){
                res+=Math.min(zeroct,onect);
                while(onect!=0){
                    onect--;
                    i++;
                }
            }
        }
        if(s.charAt(j)=='0'){
            zeroct++;
        }
        else{
            onect++;
        }
        System.out.println(zeroct+" "+onect);
        j++;
      }
      /*while(i<j){
        if(s.charAt(i)=='0'){
            zeroct--;
        }
        else{
            onect--;
        }
        if(zeroct==onect){
            res+=zeroct;
        }
        i++;
      }*/
      return res+Math.min(zeroct,onect);  
    }
}
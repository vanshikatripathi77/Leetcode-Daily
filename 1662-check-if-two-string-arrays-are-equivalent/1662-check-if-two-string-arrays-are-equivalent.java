class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            str1.append(word1[i]);
        }
        StringBuilder str2=new StringBuilder();
        for(int i=0;i<word2.length;i++){
            str2.append(word2[i]);
        }
        System.out.println(str1);
        System.out.println(str2);
        if(str1.toString().equals(str2.toString())){
            return true;
        }
        return false;
    }
}
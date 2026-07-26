class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        HashMap<Character,String> hp=new HashMap<Character,String>();
        hp.put('2',"abc");
        hp.put('3',"def");
        hp.put('4',"ghi");
        hp.put('5',"jkl");
        hp.put('6',"mno");
        hp.put('7',"pqrs");
        hp.put('8',"tuv");
        hp.put('9',"wxyz");
        List<String> res=new ArrayList<>();
        f(0,digits,hp,res,new StringBuilder());
        return res;
    }
    public void f(int i,String digits,HashMap<Character,String> hp,List<String> res,StringBuilder str){
        if(i==digits.length()){
            res.add(str.toString());
            return;
        }
        String curr=hp.get(digits.charAt(i));
        for(char ch:curr.toCharArray()){
            str.append(ch);
            f(i+1,digits,hp,res,str);
            str.deleteCharAt(str.length()-1);
        }
    }
}
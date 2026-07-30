class Solution {
    public int minimumPushes(String word) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        hp.put(2,0);
        hp.put(3,0);
        hp.put(4,0);
        hp.put(5,0);
        hp.put(6,0);
        hp.put(7,0);
        hp.put(8,0);
        hp.put(9,0);
        int n=word.length();
        int i=0;
        int key_index=2;
        int ans=0;
        while(i<n){
            if(key_index>9){
                key_index=2;
            }
            hp.put(key_index,hp.getOrDefault(key_index,0)+1);
            ans+=hp.get(key_index);
            i++;
            key_index++;
        }
        return ans;
    }
}
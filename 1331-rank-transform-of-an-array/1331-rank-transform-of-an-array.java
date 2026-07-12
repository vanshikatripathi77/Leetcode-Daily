class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        int[] sorted_arr=Arrays.copyOf(arr,arr.length);
        Arrays.sort(sorted_arr);
        int ct=1;
        for(int i=0;i<sorted_arr.length;i++){
            if(i>0 && sorted_arr[i]>sorted_arr[i-1]){
                ct++;
            }
            hp.put(sorted_arr[i],ct);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=hp.get(arr[i]);
        }
        return arr;
    }
}
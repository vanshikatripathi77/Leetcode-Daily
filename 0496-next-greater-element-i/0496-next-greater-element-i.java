class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            hp.put(nums2[i],i);
        }
        int n=nums1.length;
        int[] arr=new int[n];
        Arrays.fill(arr,-1);
        for(int i=0;i<nums1.length;i++){
            int n1=hp.get(nums1[i]);
            for(int j=n1;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    arr[i]=nums2[j];
                    break;
                }
            }
        }
        return arr;
    }
}
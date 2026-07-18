class Solution {
    public int search(int[] nums, int target) {
        int index=0;
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hp.put(nums[i],i);
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                index=i+1;
                break;
            }
        }
        int[] arr=new int[nums.length];
        int c=0;
        for(int i=index;i<arr.length;i++){
            arr[c++]=nums[i];
        }
        for(int i=0;i<index;i++){
            arr[c++]=nums[i];
        }
        for(int i:arr){
            System.out.println(i);
        }
        int left=0,right=nums.length-1;
        int mid=0;
        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]<target){
                left=mid+1;
            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            else{
                return hp.get(target);
            }
        }
        return -1;
    }
}
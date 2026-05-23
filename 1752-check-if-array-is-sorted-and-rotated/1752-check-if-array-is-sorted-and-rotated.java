class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int target=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]<nums[i]){
                target=i+1;
                break;
            }
        }
        int[] arr=new int[n];
        int a=0;
        for(int i=target;i<n;i++){
            arr[a++]=nums[i];
        }
        for(int i=0;i<target;i++){
            arr[a++]=nums[i];
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
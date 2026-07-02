class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int j=1;
        int c=0;
        nums[c++]=nums[j-1];
        while(j<n){
            if(nums[j]!=nums[j-1]){
                nums[c++]=nums[j];
            }
            j++;
        }
        return c;
    }
}
class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length,ind1=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                ind1=i-1;
                break;
            }
        }
        if(ind1!=-1){
            for(int i=n-1;i>=ind1;i--){
                if(nums[i]>nums[ind1]){
                    int temp=nums[i];
                    nums[i]=nums[ind1];
                    nums[ind1]=temp;
                    break;
                }
            }
        }
        int j=0;
        if(ind1!=-1){
            j=ind1+1;
        }
        int k=n-1;
        while(j<=k){
            int temp=nums[j];
            nums[j]=nums[k];
            nums[k]=temp;
            j++;
            k--;
        }   
    }
}
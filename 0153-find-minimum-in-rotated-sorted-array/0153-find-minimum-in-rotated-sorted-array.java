class Solution {
    public int findMin(int[] nums) {
        int smallest=Integer.MAX_VALUE;
        for(int i:nums){
            smallest=Math.min(smallest,i);
        }
        return smallest;
    }
}
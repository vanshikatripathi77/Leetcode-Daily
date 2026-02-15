class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hp.put(nums[i],i);
        }
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(hp.containsKey(target-x) && hp.get(target-x)!=i){
                res[0]=i;
                res[1]=hp.get(target-x);
            }
        }
        return res;
    }
}
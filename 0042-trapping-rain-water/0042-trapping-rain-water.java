class Solution {
    public int trap(int[] height) {
        int[] maxleft=new int[height.length];
        int[] maxright=new int[height.length];
        maxleft[0]=height[0];
        maxright[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            maxleft[i]=Math.max(height[i],maxleft[i-1]);
        }
        for(int i=height.length-2;i>=0;i--){
            maxright[i]=Math.max(height[i],maxright[i+1]);
        }
        int res=0;
        for(int i=0;i<height.length;i++){
            if(height[i]<Math.min(maxleft[i],maxright[i])){
                res+=Math.min(maxleft[i],maxright[i])-height[i];
            }
        }
        return res;
    }
}
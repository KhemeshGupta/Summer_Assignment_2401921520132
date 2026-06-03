class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        long ans=0;
        while(i<j){
            int wid=j-i;
            int area=Math.min(height[i],height[j])*wid;
            ans=Math.max(ans,area);
            if(height[i]<=height[j]){
                i++;
            }else{
                j--;
            }
        }
        return (int)ans;
    }
}
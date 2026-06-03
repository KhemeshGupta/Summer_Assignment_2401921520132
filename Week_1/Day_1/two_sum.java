class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] k=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<nums.length;j++){
                if(target==nums[i]+nums[j] && i!=j){
                    k[0]=i;
                    k[1]=j;
                }
            }
        }
        return k;
    }
}    
    


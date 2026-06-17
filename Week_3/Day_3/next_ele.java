class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> indexMap = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            indexMap.put(nums2[i], i);
        }
        for(int i=0;i<nums1.length;i++){
            int ele = nums1[i];
            int idx = indexMap.get(ele);
            int next = -1;
            for(int j=idx+1;j<nums2.length;j++){
                if(nums2[j] > ele){
                    next = nums2[j];
                    break;
                }
            }
            nums1[i] = next;
        }

        return nums1;   
    }
}
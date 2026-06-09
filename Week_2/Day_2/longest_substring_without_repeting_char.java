class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            if(map.containsKey(key)){
                left=Math.max(left,map.get(key)+1);
            }
            map.put(key,i);
            ans=Math.max(ans,i-left+1);   
        }
        return ans;
    }
}
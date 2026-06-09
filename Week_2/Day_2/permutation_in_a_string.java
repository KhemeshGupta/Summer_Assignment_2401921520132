class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        int[] sCount=new int[26];
        int[] pCount=new int[26];
        for(int i=0;i<s1.length();i++){
            pCount[s1.charAt(i)-'a']++;
            sCount[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(pCount,sCount)) return true;
        for(int i=s1.length();i<s2.length();i++){
            sCount[s2.charAt(i)-'a']++;
            sCount[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(pCount,sCount)){
                return true;
            }
        }
        return false;
    }
}
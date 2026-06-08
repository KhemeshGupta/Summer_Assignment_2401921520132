class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char key=t.charAt(i);
            map1.put(key,map1.getOrDefault(key,0)+1);
        }
        return map.equals(map1);
    }
}
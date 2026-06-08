class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> mapy=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char key=magazine.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char key=ransomNote.charAt(i);
            mapy.put(key, mapy.getOrDefault(key, 0) + 1);
        }
        if(map.size()<mapy.size()) return false;
        for(char c:mapy.keySet()){
            if(map.containsKey(c)){
                if(mapy.get(c)>map.get(c)) return false;
                else{
                    continue;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
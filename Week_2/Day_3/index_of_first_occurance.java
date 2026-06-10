class Solution {
    public int strStr(String haystack, String needle) {
        int x=haystack.length();
        int y=needle.length();
        for(int i=0;i<=x-y;i++){
            int j;
            for( j=0;j<y;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }
            if(j==y){
                return i;
            }
        }
        return -1;
    }
}
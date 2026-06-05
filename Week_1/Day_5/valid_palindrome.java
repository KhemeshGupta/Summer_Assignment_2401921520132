class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        StringBuilder p=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            p.append(s.charAt(i));
        }
        return s.equals(p.toString());
    }
}
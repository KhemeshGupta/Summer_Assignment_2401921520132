class Solution {
    public void reverseString(char[] s) {
        int p=s.length;
        int op=0;
        while(op<p){
            char temp=s[op];
            s[op]=s[p-1];
            s[p-1]=temp;
            op++;
            p--;
        }
        System.out.println(s);
        return ;
    }
}

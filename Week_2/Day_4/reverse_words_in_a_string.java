class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            String reversed=new StringBuilder(str).reverse().toString();
            arr[i]=reversed;
        }
        String ans=String.join(" ",arr);
        return ans;
    }
}
class Solution {
    public boolean isValid(String s) {
        java.util.Stack<Character> stack=new java.util.Stack<>();
        if(s.length()%2==1){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='('){
                stack.push(s.charAt(i));
                
            }
            else if(!stack.isEmpty()){
                char top=stack.peek();
                if((top=='(' && s.charAt(i)==')') || (top=='[' && s.charAt(i)==']') || (top=='{' && s.charAt(i)=='}')){
                    stack.pop();

                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
            
            
        } 
        return stack.isEmpty();  
    }
}
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String key=tokens[i];
            if(key.equals("+")){
                int a=s.pop();
                int b=s.pop();
                s.push(a+b);
            }else if(key.equals("/")){
                int c=s.pop();
                int d=s.pop();
                s.push(d/c);
            }else if(key.equals("*")){
                int e=s.pop();
                int f=s.pop();
                s.push(f*e);
            }else if(key.equals("-")){
                int g=s.pop();
                int h=s.pop();
                s.push(h-g);
            }else{
                s.push(Integer.parseInt(key));
            }
        }
        return s.pop();
    }
}
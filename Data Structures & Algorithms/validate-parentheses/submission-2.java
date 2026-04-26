class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack=new Stack<>();

        for(char c: s.toCharArray()){
            if(c=='[' || c=='{' || c== '('){
                stack.push(c);
            }
            else if (stack.size() ==0) 
                return false;
            else{
                char v=stack.pop();
                switch (c){
                case '}':{
                    if(v != '{') return false;
                    break;
                }
                case ']':{
                    if(v != '[') return false;
                    break;
                }
                case ')':{
                    if(v != '(') return false;
                    break;
                }
            }
            }
            
        }
        if (stack.size() != 0 ) return false;
        return true;
        
    }
}

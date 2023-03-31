import java.util.Stack;

public class ValidParentheses_20 {
    public boolean isValid(String s) {
        if(s.length()%2==1) return false;
        Stack<Character> stack=new Stack<>();
        char top;
        for(char i:s.toCharArray()){
            if(i=='('||i=='{'||i=='['){
                stack.push(i);
                System.out.println(stack.toString());
            }else{
                if(stack.isEmpty()) return false;
                top=stack.pop();
                if(i==')'&&top!='('){
                    System.out.println(stack.get(stack.toArray().length-1)+"");
                    return false;
                }else if(i==']'&&top!='['){
                    System.out.println(stack.get(stack.toArray().length-1)+"");
                    return false;
                }if(i=='}'&&top!='{'){
                    System.out.println(stack.get(stack.toArray().length-1)+"");
                    return false;
                }
                
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
    public static void main(String[] args) {
        ValidParentheses_20 temp=new ValidParentheses_20();
        System.out.println(temp.isValid("()"));
   }
}
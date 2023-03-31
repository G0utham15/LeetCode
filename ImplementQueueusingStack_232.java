import java.util.Stack;

class MyQueue {
    Stack<Integer> stack1, stack2;
    int top;
    public MyQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }
    
    public void push(int x) {
        if(stack1.isEmpty()) top=x;
        stack1.push(x);
    }
    
    public int pop() {
        if(stack1.isEmpty()&&stack2.isEmpty()) return -1;
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int res= stack2.pop();
        //top=-1;
        while(!stack2.isEmpty()){
            if(stack1.isEmpty()) {
               top=stack2.pop();
                stack1.push(top);
                continue;
            }
            stack1.push(stack2.pop());
        }
        return res;
    }
    
    public int peek() {
        return top;
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
}
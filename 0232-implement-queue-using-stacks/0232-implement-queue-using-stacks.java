class MyQueue {
    Stack<Integer> st;
    Stack<Integer> st2;
    public MyQueue() {
        st = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(st.size() > 1){
            st2.push(st.pop());
        }
        int num = st.pop();
        while(st2.size() > 0){
            st.push(st2.pop());
        }
        return num;
    }
    
    public int peek() {
        while(st.size() > 1){
            st2.push(st.pop());
        }
        int num = st.peek();
        while(st2.size() > 0){
            st.push(st2.pop());
        }
        return num;
    }
    
    public boolean empty() {
        return (st.size() == 0);
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
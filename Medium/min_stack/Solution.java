package min_stack;


class MinStack {
    Deque<Integer> stack;
    Deque<Integer> min;
    int curr_min;;

    public MinStack() {
        stack = new ArrayDeque<>();
        min = new ArrayDeque<>();
    }
    
    public void push(int value) {
        stack.push(value);

        if (min.isEmpty()) {
            min.push(value);
        } else {
            min.push(Math.min(value, min.peek()));
        }
    }
    
    public void pop() {
        min.pop();
        stack.pop();

        // System.out.println("Pop(): ");
        // System.out.println("Stack: " + stack);
        // System.out.println("Min..: " + min);
        // System.out.println();
    }
    
    public int top() {
        // System.out.println("Top(): ");
        // System.out.println("Stack: " + stack);
        // System.out.println("Min..: " + min);
        // System.out.println();
        return stack.peek();
    }
    
    public int getMin() {
        // System.out.println("GetMin(): ");
        // System.out.println("Stack: " + stack);
        // System.out.println("Min..: " + min);
        // System.out.println();
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
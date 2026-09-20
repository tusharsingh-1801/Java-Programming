class MinStack {

    private Stack<Long> s = new Stack<>();
    private long minVal;

    public MinStack() {
    }

    public void push(int value) {
        if (s.isEmpty()) {
            s.push((long) value);
            minVal = value;
        } else if (value < minVal) {
           
            s.push(2L * value - minVal);
            minVal = value;
        } else {
            s.push((long) value);
        }
    }

    public void pop() {
        long top = s.pop();
        if (top < minVal) {
            
            minVal = 2 * minVal - top;
        }
    }

    public int top() {
        long top = s.peek();
        if (top < minVal) {
            return (int) minVal;
        } else {
            return (int) top;
        }
    }

    public int getMin() {
        return (int) minVal;
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
class StockSpanner {
    Stack<int[]> s = new Stack<>();

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int ans = 1;

        while (s.size() > 0 && s.peek()[0] <= price) {
            ans += s.pop()[1];
        }

        s.push(new int[]{price, ans});

        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
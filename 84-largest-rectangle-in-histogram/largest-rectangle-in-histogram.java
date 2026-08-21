class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> s = new Stack<>();
        int[] right = new int[n];
        for(int i =n-1;i>=0;i--){
            while(s.size() > 0 && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            right[i] = s.isEmpty() ? n:s.peek();
            s.push(i);
        }
        s.clear();
        int[] left = new int[n];
        for(int i = 0;i<n;i++){
            while(s.size() > 0&& heights[s.peek()] >= heights[i]){
                s.pop();
            }
            left[i] = s.isEmpty()?-1:s.peek();
            s.push(i);
        }
        
        int ans =0;
        for(int i =0;i<n;i++){
            int width = right[i]-left[i] -1;
            int currArea = heights[i]*width;
            ans = Math.max(ans,currArea);
        }
        return ans;
    }
}
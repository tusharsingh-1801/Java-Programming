class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c) {
                st.pop(); 
            } else {
                st.push(c); 
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : st) {
            result.append(c);
        }
        
        return result.toString();
    }
}
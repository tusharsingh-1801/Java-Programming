class Solution {
    public String removeOccurrences(String s, String part) {
        int n = s.length();
        int m = part.length();
        
        StringBuilder ans = new StringBuilder();
        int left = 0;

        while(left < n){
            
            ans.append(s.charAt(left));
            
            if(ans.length() >= m){
                if(ans.substring(ans.length() -m).equals(part)){
                    ans.delete(ans.length()-m,ans.length());
                }
            }
        left++;
        }
        return ans.toString();
    }
}
class Solution {
    private boolean isPalin(String s ,int left,int right){
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private void backtrack(String s, int start,List<String> curr,List<List<String>> ans){
        if(start == s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int end = start;end <s.length();end++){
            if(isPalin(s,start,end)){
                curr.add(s.substring(start,end+1));
                backtrack(s,end+1,curr,ans);
                curr.remove(curr.size()-1);
            }
        }
    }



    public List<List<String>> partition(String s) {
        List<String> curr = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();

        backtrack(s,0,curr,ans);

        return ans;

    }
}
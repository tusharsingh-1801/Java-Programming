class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int val:nums){
            if(s.contains(val)){
                return val;
            }
            s.add(val);
        }
        return -1;
    }
}
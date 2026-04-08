import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        int xorResult = 0;
        for(int num : nums){
            xorResult ^= num;
        }
        return xorResult;
        
    }
    public static void main(String args[]){
        int[] nums = {2,2,1};
        Solution sol = new Solution();
        int result = sol.singleNumber(nums);
        System.out.println(result);
    }
}
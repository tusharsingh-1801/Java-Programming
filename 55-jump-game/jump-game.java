class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0; // the farthest index we can reach
        
        for (int i = 0; i < nums.length; i++) {
            // If current index is beyond maxReach, we can't move forward
            if (i > maxReach) {
                return false;
            }
            
            // Update the farthest we can reach from this position
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        
        // If we finish the loop, it means we can reach the last index
        return true;
    }

    // Optional: main method to test examples
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println(solution.canJump(nums1)); // true
        
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println(solution.canJump(nums2)); // false
    }
}

        

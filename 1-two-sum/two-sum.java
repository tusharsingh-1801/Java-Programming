
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store number -> index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement already exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, put the current number and its index into the map
            map.put(nums[i], i);
        }
        
        // According to the problem, this line will never be reached
        throw new IllegalArgumentException("No two sum solution");
    }

    // Optional: main method to test examples
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Output: [" + result1[0] + "," + result1[1] + "]"); // [0,1]
        
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Output: [" + result2[0] + "," + result2[1] + "]"); // [1,2]
        
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Output: [" + result3[0] + "," + result3[1] + "]"); // [0,1]
    }
}

        
    

class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
         int maxSoFar = arr[0];       // Initialize maximum sum so far
        int maxEndingHere = arr[0];  // Maximum sum ending at current index

        for (int i = 1; i < arr.length; i++) {
            // Either extend the current subarray or start a new subarray at arr[i]
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            
            // Update overall maximum sum
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
   
    }
}

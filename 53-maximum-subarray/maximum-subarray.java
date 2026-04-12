class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currSum += nums[i];
            maxSum = Math.max(currSum,maxSum);
            if(currSum <0){
                currSum = 0;
            }

       
        }
        return maxSum;
    }
    public static void main(String args[]){
        int[] nums = {-2,1,2-3,4,-1,2,1,-5,4};
        Solution sol = new Solution();
        int result = sol.maxSubArray(nums);
        System.out.println(result);
    }
}

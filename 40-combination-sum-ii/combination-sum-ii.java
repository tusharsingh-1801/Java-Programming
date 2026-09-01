class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backtrack(nums, target, 0, curr, result);

        return result;
    }

    private void backtrack(int[] nums, int target, int start,
                           List<Integer> curr,
                           List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < nums.length; i++) {

            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] > target) {
                break;
            }

            
            curr.add(nums[i]);

            
            backtrack(nums, target - nums[i], i + 1, curr, result);

         
            curr.remove(curr.size() - 1);
        }
    }
}
import java.util.*;

class Solution {

    void allSubsets(int[] nums, List<Integer> ans, int i,
                    List<List<Integer>> allSubset) {

        
        if (i == nums.length) {
            allSubset.add(new ArrayList<>(ans));
            return;
        }

       
        ans.add(nums[i]);

        allSubsets(nums, ans, i + 1, allSubset);

      
        ans.remove(ans.size() - 1);

       
        int idx = i + 1;

        while (idx < nums.length && nums[idx] == nums[i]) {
            idx++;
        }

       
        allSubsets(nums, ans, idx, allSubset);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

       
        Arrays.sort(nums);

        List<List<Integer>> allSubset = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        allSubsets(nums, ans, 0, allSubset);

        return allSubset;
    }
}
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<n-3;i++){
            if(i>0 && nums[i] == nums[i-1]) {
             continue;
            }
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                    int l = j+1;
                    int m = n-1;
                    while(l<m){
                        long sum = (long) nums[i] + nums[j] + nums[l] + nums[m];
                        if(sum < target){
                            l++;
                        }else if(sum > target){
                             m--;
                        }else{
                            ans.add(Arrays.asList(nums[i],nums[j],nums[l],nums[m]));
                            l++;
                            m--;
                        
                            while(l<m && nums[l] == nums[l-1]){
                            l++;
                            }
                            while(l<m && nums[m] == nums[m+1]){
                            m--;
                            }
                        }
                    }
                }
            }
        
            
        return ans;
    }
}
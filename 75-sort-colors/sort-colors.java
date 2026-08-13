class Solution {
    public void sortColors(int[] nums) {
      int n = nums.length;
      int left = 0;
      int i =0;
      int right = n-1;

      while(i <= right){
        if(nums[i] == 0){
            int temp = nums[left];
            nums[left] = nums[i];
            nums[i] = temp;
            left++;
            i++;
        }
        else if(nums[i] == 2){
            int temp = nums[right];
            nums[right] = nums[i];
            nums[i] = temp;
            right--;
       }  else{
        i++;
       }

    }
 }
}
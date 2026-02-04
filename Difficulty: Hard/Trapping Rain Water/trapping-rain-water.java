class Solution {
    
    public int maxWater(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1;
        int maxLeft = 0, maxRight = 0;
        int water = 0;

        while (left <= right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    water += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    water += maxRight - height[right];
                }
                right--;
            }
        }

        return water;
    }

    
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 0, 4, 0, 2};
        Solution ob = new Solution();
        System.out.println(ob.maxWater(arr)); // 10
    }
}

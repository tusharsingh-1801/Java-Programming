class Solution {
    public void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            // swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }

    // Optional: main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] arr1 = {1, 4, 3, 2, 6, 5};
        solution.reverseArray(arr1);
        for (int num : arr1) System.out.print(num + " ");
        System.out.println();
        
        int[] arr2 = {4, 5, 2};
        solution.reverseArray(arr2);
        for (int num : arr2) System.out.print(num + " ");
        System.out.println();
        
        int[] arr3 = {1};
        solution.reverseArray(arr3);
        for (int num : arr3) System.out.print(num + " ");
    }
}

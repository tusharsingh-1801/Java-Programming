import java.util.*;

class Solution {
    public int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return 0;

        Arrays.sort(arr);

        int ans = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {

            // If decreasing makes height negative, skip
            if (arr[i] - k < 0) continue;

            int maxHeight = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            int minHeight = Math.min(arr[0] + k, arr[i] - k);

            ans = Math.min(ans, maxHeight - minHeight);
        }

        return ans;
    }
}

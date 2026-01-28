import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        
        // Add all elements from array a
        for (int num : a) {
            set.add(num);
        }
        
        // Add all elements from array b
        for (int num : b) {
            set.add(num);
        }
        
        // Convert set to ArrayList and return
        return new ArrayList<>(set);
    }
}

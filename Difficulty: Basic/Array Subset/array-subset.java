import java.util.*;

class Solution {
    public boolean isSubset(int[] a, int[] b) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : b) {
            if (!map.containsKey(num) || map.get(num) == 0) return false;
            map.put(num, map.get(num) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 3, 7, 1, 7};

        Solution ob = new Solution(); // create object
        System.out.println(ob.isSubset(a, b)); // true
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Object[]> queue = new LinkedList<>();
        queue.offer(new Object[]{root, 0});
        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int first = 0, last = 0;
            
            int levelMin = (int) queue.peek()[1];

            for (int i = 0; i < size; i++) {
                Object[] cur = queue.poll();
                TreeNode node = (TreeNode) cur[0];
                int idx = (int) cur[1] - levelMin;

                if (i == 0) first = idx;
                if (i == size - 1) last = idx;

                if (node.left != null) {
                    queue.offer(new Object[]{node.left, 2 * idx});
                }
                if (node.right != null) {
                    queue.offer(new Object[]{node.right, 2 * idx + 1});
                }
            }
            maxWidth = Math.max(maxWidth, last - first + 1);
        }
        return maxWidth;
    }
}

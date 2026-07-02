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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> level = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        int currSize;
        TreeNode current;

        if (root == null) {
            return ans;
        }

        queue.offer(root);
        while (!queue.isEmpty()) {

            currSize = queue.size();
            level = new ArrayList<>();
            for (int i = 0; i < currSize; i++) {
                current = queue.poll();

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }

                level.add(current.val);
            }

            ans.add(level);
        }

        return ans;
    }
}
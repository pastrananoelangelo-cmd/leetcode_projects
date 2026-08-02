// Memoization
class Solution {
    public int rob(int[] nums) {
        HashMap<Integer, Integer> memo = new HashMap<>();

        int ans = dfs(nums, memo, 0);

        return ans;
    }

    private int dfs(int[] nums, HashMap<Integer, Integer> memo, int curr) {
        if (memo.containsKey(curr)) {
            return memo.get(curr);
        }
        
        if (curr >= nums.length) {
            return 0;
        }

        memo.put(curr, Math.max(
                nums[curr] + dfs(nums, memo, curr + 2), // Take
                dfs(nums, memo, curr + 1)               // Skip
            )
        );

        return memo.get(curr);
    }
}
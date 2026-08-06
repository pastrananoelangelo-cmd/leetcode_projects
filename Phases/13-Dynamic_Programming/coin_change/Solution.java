// Memoization
class Solution {
    public int coinChange(int[] coins, int amount) {
        HashMap<Integer, Integer> memo = new HashMap<>();

        int ans = dp(coins, amount, memo);

        if (amount == 0) {
            return 0;
        }

        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        
        return ans;
    }

    private int dp(int[] coins, int amount, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }
        
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return Integer.MAX_VALUE;
        }

        int best = Integer.MAX_VALUE;
        for (Integer coin : coins) {
            int candidates = dp(coins, amount - coin, memo);

            if (candidates != Integer.MAX_VALUE) {
                candidates++;
            }

            best = Math.min(best, candidates);
        }
        memo.put(amount, best);

        return best;
    }
}
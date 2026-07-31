// Top-Down
class Solution2 {
    public int climbStairs(int n) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        
        int ans = fib(n, memo);

        return ans;
    }

    private int fib(int n, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        memo.put(n, fib(n - 1, memo) + fib(n - 2, memo));
        return memo.get(n);
    }
}
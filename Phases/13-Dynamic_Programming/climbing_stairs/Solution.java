// Bottom-up

class Solution {
    public int climbStairs(int n) {
        int x = 1;
        int y = 2;
        int ans = 0;

        if (n == 1) {
            return x;
        } else if (n == 2) {
            return y;
        } else {
            for (int i = 2; i < n; i++) {
                ans = x + y;
                x = y;
                y = ans;
            }
        }

        return ans;
    }
}
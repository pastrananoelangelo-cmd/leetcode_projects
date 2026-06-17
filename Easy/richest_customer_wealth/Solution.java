package easy.richest_customer_wealth;


class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0, curr;

        for (int i = 0; i < accounts.length; i++) {
            curr = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                curr += accounts[i][j];
            }

            if (curr > max) {
                max = curr;
            }
        }

        return max;
    }
}
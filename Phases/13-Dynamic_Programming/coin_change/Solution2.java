// Tabulation
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] tab = new int[amount + 1];
        int temp;

        if (amount == 0) {
            return 0;
        }

        tab[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            int best = Integer.MAX_VALUE;

            for (Integer coin : coins) {
                temp = i;
                temp -= coin;

                if (temp < 0 || tab[temp] == Integer.MAX_VALUE) {
                    temp = Integer.MAX_VALUE;
                } else {
                    temp = tab[temp] + 1;
                }

                best = Math.min(best, temp);
            }

            tab[i] = best;
        }

        if (tab[amount] == Integer.MAX_VALUE) {
            return -1;
        }

        return tab[amount];
    }
}
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = Integer.MIN_VALUE, mid;
        int first = Integer.MAX_VALUE;
        int curr;
        double ans;

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > right) {
                right = piles[i];
            }
        }

        while (left <= right) {
            mid = left + (right - left) / 2;
            curr = 0;
            for (int i = 0; i < piles.length; i++) {
                ans = 1.0 * piles[i] / mid;
                ans = Math.ceil(ans);
                curr += ans;
            }

            if (curr <= h) {
                if (mid < first) {
                    first = mid;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return first;
    }
}
// Tabulation
class Solution2 {
    public int rob(int[] nums) {
        int[] tab = new int[nums.length];
        int ans = 0;

        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        tab[0] = nums[0];
        tab[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            ans = Math.max(nums[i] + tab[i - 2], tab[i - 1]);
            tab[i] = ans;
        }

        return ans;
    }
}
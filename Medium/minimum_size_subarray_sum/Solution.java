class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int curr = 0, min = Integer.MAX_VALUE, left = 0;

        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];

            while (curr >= target) {
                // curr_min = i + 1 - left;

                // if (curr_min < min) {
                //     min = curr_min;
                // }

                min = Math.min(min, i - left + 1);

                curr -= nums[left];
                left++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
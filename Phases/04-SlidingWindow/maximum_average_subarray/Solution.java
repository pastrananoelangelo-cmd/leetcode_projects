package easy.maximum_average_subarray;


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Double.NEGATIVE_INFINITY, curr = 0;
        
        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }

        if (curr > max) {
            max = curr;
        }

        for (int i = k; i < nums.length; i++) {
            curr -= nums[i - k];
            curr += nums[i];

            if (curr > max) {
                max = curr;
            }
        }

        return max / k;
    }
}
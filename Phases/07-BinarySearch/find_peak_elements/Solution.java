class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1, mid;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (mid + 1 < nums.length && nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else if (0 <= mid - 1 && nums[mid - 1] > nums[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
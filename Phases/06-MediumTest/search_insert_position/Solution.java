class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = 0;

        while (left < right) {
            mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        if (nums[left] < target) {
            mid = left + 1;
        } else {
            mid = left;
        }

        return mid;
    }
}
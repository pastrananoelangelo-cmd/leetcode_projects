package remove_duplicates_from_sorted_array;

class Solution {
    public int removeDuplicates(int[] nums) {
        int valid = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[valid - 1] < nums[i]) {
                nums[valid] = nums[i];
                valid++;
            }
        }

        return valid;
    }
}
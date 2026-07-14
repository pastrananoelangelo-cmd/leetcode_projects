package easy.find_numbers_even_digits;


class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0, curr, count;

        for (int i = 0; i < nums.length; i++) {
            curr = nums[i];
            count = 0;

            while (curr > 0) {
                curr /= 10;
                count++;
            }

            if (count % 2 == 0) {
                ans++;
            }
        }

        return ans;
    }
}

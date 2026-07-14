package product_array_except_self;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int curr = 1;

        // Left to Right
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Right to Left.
        for (int i = nums.length - 2; i >= 0 ; i--) {
            curr *= nums[i + 1];
            ans[i] *= curr;
        }

        return ans;
    }
}

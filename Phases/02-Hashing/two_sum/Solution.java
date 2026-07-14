package easy.two_sum;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int difference;

        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i];

            if (map.containsKey(difference)) {
                ans[0] = map.get(difference);
                ans[1] = i;
                return ans;
            } else {
                map.put(nums[i], i);
            }
        }

        return ans;
    }
}
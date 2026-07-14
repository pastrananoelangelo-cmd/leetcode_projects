class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currSub = new ArrayList<>();

        exploreSubsets(ans, currSub, nums, 0);

        return ans;
    }

    private void exploreSubsets(List<List<Integer>> ans, List<Integer> currSub, int[] nums, int index) {
        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>(currSub);
            ans.add(temp);
        } else {
            // Take
            currSub.add(nums[index]);
            exploreSubsets(ans, currSub, nums, index + 1);

            // Skip
            currSub.remove(currSub.size() - 1);
            exploreSubsets(ans, currSub, nums, index + 1);
        }
    }
}
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        buildPermutation(ans, curr, set, nums, 0);

        return ans;
    }

    private void buildPermutation(List<List<Integer>> ans, List<Integer> curr, 
    HashSet<Integer> set, int[] nums, int pos) {
        System.out.println(Arrays.asList(curr));
        if (nums.length == pos) {
            if (nums.length == curr.size()) {
                List<Integer> temp = new ArrayList<>(curr);
                ans.add(temp);
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (!set.contains(nums[i])) {
                    curr.add(nums[i]);
                    set.add(nums[i]);
                } else {
                    continue;
                }

                buildPermutation(ans, curr, set, nums, pos + 1);
                int num = curr.remove(curr.size() - 1);
                set.remove(num);
            }
        }
    }
}
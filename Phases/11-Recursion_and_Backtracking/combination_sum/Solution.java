class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        runningSum(ans, curr, candidates, target, 0, 0);

        return ans;
    }

    private void runningSum(List<List<Integer>> ans, List<Integer> curr, 
    int[] candidates, int target, int currSum, int pos) {
        if (currSum >= target) {
            if (currSum == target) {
                List<Integer> temp = new ArrayList<>(curr);
                ans.add(temp);
            }
        } else {
            for (int i = pos; i < candidates.length; i++) {
                curr.add(candidates[i]);
                currSum += candidates[i];

                runningSum(ans, curr, candidates, target, currSum, i);
                int val = curr.remove(curr.size() - 1);
                currSum -= val;
            }
        }
    }
}
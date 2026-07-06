class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            buildPermutation(i);
        }

        return ans;
    }

    private void buildPermutation(int depth) {
        if (depth == 3){
            System.out.println("Reached.");
        } else {
            for (int j = 0; j < 2; j++) {
                System.out.println(j + " " + depth);
                buildPermutation(depth + 1);
            }
        }
    }
}
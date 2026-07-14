class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        int[] ans = new int[k];
        int[] topK;
        
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            }
            map.put(nums[i], map.get(nums[i]) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (heap.size() < k) {
                heap.offer(new int[]{entry.getKey(), entry.getValue()});
            } else {
                topK = heap.peek();
                if (entry.getValue() > topK[1]) {
                    heap.poll();
                    heap.offer(new int[]{entry.getKey(), entry.getValue()});
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            topK = heap.poll();
            ans[i] = topK[0];
        }

        return ans;
    }
}
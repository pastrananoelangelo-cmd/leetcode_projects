class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < stones.length; i++) {
            maxHeap.offer(stones[i]);
        }

        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();
            int remain = stone1 - stone2;

            if (remain > 0) {
                maxHeap.offer(remain);
            }

        }

        if (maxHeap.isEmpty()) {
            return 0;
        }

        return maxHeap.poll();
    }
}
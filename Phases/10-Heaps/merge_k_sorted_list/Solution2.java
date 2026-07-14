// Second Solution: ELEGANT!

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution2 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode ans = new ListNode();
        ListNode tail = ans;

        for (ListNode node : lists) {
            if (node != null) {
                heap.offer(node);
            }
        }

        while (!heap.isEmpty()) {
            ListNode smallest = heap.poll();

            tail.next = smallest;
            tail = tail.next;

            if (smallest.next != null) {
                heap.offer(smallest.next);
            }
        }

        return ans.next;
    }
}
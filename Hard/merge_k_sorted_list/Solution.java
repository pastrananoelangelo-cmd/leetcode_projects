// First Solution

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
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int listSize = lists.length, i = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        ListNode ans = new ListNode();
        ListNode tail = ans;

        while (i < listSize) {

            while (lists[i] != null) {
                heap.offer(lists[i].val);
                lists[i] = lists[i].next;
            }

            i++;
        }

        while (heap.size() != 0) {
            tail.next = new ListNode(heap.poll());
            tail = tail.next;
        }

        return ans.next;
    }
}
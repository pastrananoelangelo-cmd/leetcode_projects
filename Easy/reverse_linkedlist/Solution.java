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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;
        
        // Example: head = 1, 2, 3
        while (current != null) {
            next = current.next; // next = node 2

            current.next = prev; // current.next = null (node 1 -> null)

            prev = current; // prev receives node 1, (1 -> null)
            current = next; // current now has node 2
        }

        return prev;
    }
}
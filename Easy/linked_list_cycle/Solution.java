// FIRST SOLUTION

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode current = head;
        HashSet<ListNode> set = new HashSet<>();

        while (current != null) {
            System.out.println(
                current.val +
                " -> " +
                System.identityHashCode(current)
            );

            if (set.contains(current)) {
                return true;
            }

            set.add(current);
            current = current.next;
        }

        return false;
    }
}
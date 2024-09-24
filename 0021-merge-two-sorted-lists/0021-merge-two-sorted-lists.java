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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to simplify the merge process
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Iterate while both lists are not empty
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next; // Move to the next node in list1
            } else {
                current.next = list2;
                list2 = list2.next; // Move to the next node in list2
            }
            current = current.next; // Move to the current node
        }

        // If there are remaining nodes in list1, append them
        if (list1 != null) {
            current.next = list1;
        }
        // If there are remaining nodes in list2, append them
        if (list2 != null) {
            current.next = list2;
        }

        // The merged list is next to the dummy node
        return dummy.next;
    }
}

   
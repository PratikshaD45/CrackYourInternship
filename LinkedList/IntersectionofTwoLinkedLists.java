/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        if (headA == null || headB == null) {
            return null;
        }
        while (temp1 != temp2) {
            temp1 = (temp1 == null) ? headA : temp1.next;
            temp2 = (temp2 == null) ? headB : temp2.next;
        }
        return temp1;

    }
}

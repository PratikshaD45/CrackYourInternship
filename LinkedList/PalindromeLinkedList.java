/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow;
        ListNode prev = null;
        ListNode nextn = null;
        while (curr != null) {
            nextn = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextn;

        }
        while (prev != null) {
            if (temp.val != prev.val) {
                return false;
            }
            prev = prev.next;
            temp = temp.next;
        }
        return true;

    }
}
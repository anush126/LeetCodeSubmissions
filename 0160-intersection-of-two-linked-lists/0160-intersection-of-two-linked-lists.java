/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempB = headB;

        while (tempB != null) {
            ListNode tempA = headA;

            while (tempA != null) {
                if (tempA == tempB) {
                    return tempA;
                }
                tempA = tempA.next;
            }
            tempB = tempB.next;
        }
        return null;
    }
}
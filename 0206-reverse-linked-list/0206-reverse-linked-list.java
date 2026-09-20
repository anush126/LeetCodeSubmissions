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
        ListNode temp = head;
        int len = 0;

        while(temp != null){
            temp = temp.next;
            len++;
        }

        int f = 0;
        int l = len - 1;
        ListNode first = head;

        while(f < l){
            int x = l;
            ListNode last = head;

            while(x > 0){
                last = last.next;
                x--;
            }
            int tempv = first.val;
            first.val = last.val;
            last.val = tempv;
            f++;
            l--;

            first = first.next;
        }

        return head;
    }
}
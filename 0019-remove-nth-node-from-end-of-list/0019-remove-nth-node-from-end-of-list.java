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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int len = 0;

        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        System.out.print(len);

        ListNode new1 = new ListNode(0);
        new1.next = head;

        ListNode new2 = new1;
        int jump = len - n;

        while(jump > 0){
            new2 = new2.next;
            jump--;
        }
        new2.next = new2.next.next;

        return new1.next;
    }
}
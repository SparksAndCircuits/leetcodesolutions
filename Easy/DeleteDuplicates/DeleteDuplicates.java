package Easy.DeleteDuplicates;

/* Leetcode question 83: Remove duplicates from sorted list

    Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

*/

public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head){
        ListNode cur = head;

        while(cur != null){
            while(cur.next != null && cur.next.val == cur.val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }

        return head;
    }
}

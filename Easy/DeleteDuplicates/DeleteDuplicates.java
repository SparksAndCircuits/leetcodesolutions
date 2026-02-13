package Easy.DeleteDuplicates;

/* Leetcode question 83: Remove duplicates from sorted list

    Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

*/

public class DeleteDuplicates {
    int size;
    public ListNode deleteDuplicates(ListNode head){
        ListNode tempNode = head;
        int value = head.val;

        for(int i = 0; i < size; i++){
            if(tempNode.val != value){
                tempNode = tempNode.next;
            }            
        }

        return tempNode;
    }
}

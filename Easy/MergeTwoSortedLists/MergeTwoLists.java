package Easy.MergeTwoSortedLists;

/*  Leetcode question 21: Merge Two sorted lists

    You are given the heads of two sorted linked lists list1 and list2.

    Merge the two lists into one sorted list. The list should be made by splicing together the nodes fo the first two lists.

    Return teh head of the merged linked list.
*/

public class MergeTwoLists {
    public ListNode head;
    public ListNode tail;
    public int size;

    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode tempNode = head;
        if(head == null){
            System.out.println("Linked List does not exist.");
        }else{

            for(int i = 0; i < size; i++){
                for (int j = 0; j < size; j++){
                    if(i < j){
                        tempNode = tempNode.next;
                    }
                }
            }
        }

        return tempNode;
    }
}

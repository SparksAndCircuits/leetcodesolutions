package Easy.MergeTwoSortedLists;

/*  Leetcode question 21: Merge Two sorted lists

    You are given the heads of two sorted linked lists list1 and list2.

    Merge the two lists into one sorted list. The list should be made by splicing together the nodes fo the first two lists.

    Return teh head of the merged linked list.
*/

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = list2;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        if(list1 != null){
            tail.next = list1;
        }else if(list2 != null){
            tail.next = list2;
        }

        return dummy.next;
    }
}

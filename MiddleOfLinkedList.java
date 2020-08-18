/**Middle Of Linked List: To find out the middle element of a Linked List
List: 1->2->4->7->9->5->6
Middle Element: 7
List: 1->2->4->7->8->5
Middle Element: 7 
Explanation: There are two middle elements 4 and 7, upon serialization we take 7 as middle element
 */

 class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
         //ASSIGN TWO NODES TO THE HEAD OF GIVEN LIST
        ListNode slow_pointer = head,  fast_pointer = head;
         
         //CHECK CONDITION i.e; UNTIL THE FAST POINTER AND THE NEXT OF FAST POINTER IS NOT EQUAL TO NULL.
        while(fast_pointer != null && fast_pointer.next != null){
            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;
        }
        return slow_pointer;
        
    }
}

/**
Code Explanation:
We have two pointers, fast and slow.
The fast_pointer moves two steps compared to slow_pointer. 
So when the fast_pointer reaches the end of the list, the slow_pointer will be in half way and by the time, the fast_pointer reaches the end of list, the slow pointer would have reached the middle elemenet which is our answer.
 */
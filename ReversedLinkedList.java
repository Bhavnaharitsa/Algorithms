/**Reversing of a Linked List:
List: 1->2->3->4->5
Reversed List: 5->4->3->2->1
 */

 class Solution {
    public ListNode reverseList(ListNode head) {
        //ASSIGN PREVIOUS VALUE TO NULL
        ListNode prev = null;
        //PERFORM OPERTION UNTIL HEAD VALUE IS NOT EQUAL TO NULL
        while(head != null){
            ListNode next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
            
        }
        //PREVIOUS NODE CONTAINS THE VALUE OF REVERSED LINKED LIST
        return prev;
    }
}
/**Linked List Cycle
 * Concept: The Linked List consists of two nodes - fast and slow.
 * So, the fast nodes moves faster than the slow node.
 * Here the Linked List is called "cycle" if the fast node and the slow node meet each other at any point in the list.
 * 
 * Example:
 * head = [3,2,0,-4], no. of cycles = 1
 * Output: true, cause there is one cycle
 * 
 */

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        //CHECK CONDITION IF HEAD IS NULL
        if(head == null)  return false;
        
        //ASSIGN SLOW= HEAD AND FAST TO THE NEXT OF HEAD.
        ListNode slow = head;
        ListNode fast = head.next;
        

        //PERFORM OPERATION SLOW IS NOT EQUAL TO FAST
        while(slow != fast) {
            //CHECK IF FAST AND THE NEXT OF FAST IS NULL
        if(fast == null || fast.next == null) {
            return false;
        }
           //MOVE SLOW TO THE NEXT OF SLOW AND FAST TO THE NEXT OF NEXT OF FAST
            slow = slow.next;
            fast = fast.next.next;
            
        }
        //FINALLY, RETURN "TRUE" AS THE FUNCTION IS BOOLEAN
        return true;
        }
}
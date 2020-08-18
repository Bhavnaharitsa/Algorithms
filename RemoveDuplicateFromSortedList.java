/**Remove duplicates from the Sorted List
 * Example:
 * List: 1->1->2->2->3
 * Duplicates Removed List: 1->2->3
 */

public class RemoveDuplicateFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        //ASSIGN THE HEAD TO A NEW NODE
        ListNode currentNode = head;
    

        //PERFORM OPERAION UNTIL HEAD AND THE NEXT OF HEAD IS NOT NULL
        while(currentNode != null && currentNode.next != null){
            //CHECK IF THE CURRENT VALUE AND NEXT VALUE ARE SAME
            if(currentNode.next.val == currentNode.val){
                //IF YES, THEN ASSIGN THE NEXT VALUE TO CURRENT VALUE
                currentNode.next =  currentNode.next.next;
            }
            else{
                //IF NOT, THEN JUST MOVE TO THE NEXT NODE IN THE LIST
            currentNode = currentNode.next;
            }
        }
        //FINALLY, PRINT HEAD WHICH IS THE NEW LIST WITH NO DUPLICATES
        return head;
        
    }
}
    
}
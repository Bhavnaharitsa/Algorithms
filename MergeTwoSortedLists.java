/**Merge Two Sorted Lists: 
List 1: 1->1->2->3->5->6
List 2: 1->3->4->6->7->9
Merged List: 1->1->1->2->3->3->4->5->6->6->7->9
**/

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //CREATE A DUMMY LIST
        ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;

        //CHECK CONDITION IF BOTH LISTS ARE EMPTY
        while(l1 != null && l2 != null){

            //IF THE VALUE OF LIST-1 IS LESS THAN VALUE OF LIST-2, ASSIGN THE VALUE OF LIST-1 TO NEW LIST
            if(l1.val <= l2.val){
                l3.next = l1;
                l1 =l1.next;
            }

           //IF THE VALUE OF LIST-2 IS LESS THAN VALUE OF LIST-1, ASSIGN THE VALUE OF LIST-2 TO NEW LIST
            else{
                 l3.next = l2;
                l2 =l2.next;
            }
            //INCREMENT THE LIST-3 TO NEXT NODE
            l3 = l3.next;
        }
        //IF LIST-2 IS EMPTY AND LIST-1 IS NOT EMPTY, SIMPLY ASSIGN THE VALUE OF NEW LIST TO LIST-1
        if(l1 != null){
            l3.next = l1;
        }
        //IF LIST-1 IS EMPTY AND LIST-1 IS NOT EMPTY, SIMPLY ASSIGN THE VALUE OF NEW LIST TO LIST-2
        if(l2 !=null){
            l3.next = l2;
        }
        
        return dummy.next;
        
        
    }
}
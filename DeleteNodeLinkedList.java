/**Delete a node from Linked List:
List: 1->2->4->5->6
Element to be removed: 5
New List: 1->2->4->6
 */

 class deleteNodeFromLinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
            node.next = node.next.next;
        }
}
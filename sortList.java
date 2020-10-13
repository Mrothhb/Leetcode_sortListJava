/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        
        if(head == null){
            return null;
        }
        int pos = 0;
        int size = 0;
        ListNode currentNode = head;
        ListNode tempNode = new ListNode();
        
        while(currentNode.next != null){
            
            if(currentNode.next != null){
                pos++;
                size++;
                currentNode = currentNode.next;
            }
        }
        size++;
        currentNode = head;
        
        for(int i = 0; i<size; i++){
            for(int j = 0; j < pos; j++){
                if(currentNode.val > currentNode.next.val){
                    tempNode.val = currentNode.val;
                    currentNode.val = currentNode.next.val;
                    currentNode.next.val = tempNode.val;
                }
                currentNode = currentNode.next;
            }
            pos--;
            currentNode = head;
        }
        return head;
    }
}



package linkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseLL {
	public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode nex = null;
        
        while(curr!= null){
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        
        return prev;
    }
}

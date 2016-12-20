package linkedList;

import java.util.HashSet;
import java.util.Set;

public class LListHasCycle {
	// HashTable Approach O(n) Space Complexity
	public boolean hasCycle1(ListNode head) {
		Set<ListNode> nodesSeen = new HashSet<>();
		ListNode curr = head;
		
		while (curr != null) {
			if (nodesSeen.contains(curr)) {
				return true;
			} else {
				nodesSeen.add(curr);
			}
			curr = curr.next;
		}
		return false;
	}
	
	
	// Two Pointer Approach O(1) Space Complexity
	public boolean hasCycle(ListNode head) {
		if(head == null || head.next ==null) return false;

		ListNode slowPointer = head;
		ListNode fastPointer = head.next;

		while(fastPointer.next!=null && fastPointer.next.next!=null){
			if(slowPointer==fastPointer){
				return true;
			}
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		return false;
	}
}

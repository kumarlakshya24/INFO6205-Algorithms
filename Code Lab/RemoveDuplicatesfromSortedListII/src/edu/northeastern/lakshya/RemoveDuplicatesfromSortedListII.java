package edu.northeastern.lakshya;

public class RemoveDuplicatesfromSortedListII {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode dummyHead = new ListNode(0);
    dummyHead.next = head;
    ListNode previous = dummyHead;
    ListNode current = head;
    while (current != null) {
      if (current.next != null && current.next.val == current.val) {
        int dupVal = current.val;
        while ( current != null && current.val == dupVal) {
          current = current.next;
        }
      }
      else {
        previous.next = current;
        previous = current;
        current = current.next;
      }
    }
    previous.next = null;
    return dummyHead.next;
  }
}

package edu.northeastern.lakshya;
public class RemoveLinkedListElements {
  public ListNode removeElements(ListNode head, int val) {
    ListNode dummyHead = new ListNode(-1);
    dummyHead.next = head;
    ListNode previous = dummyHead, current = head;
    while (current != null) {
      if (current.val == val) {
        previous.next = current.next;
      }
      else {
        previous = current;
      }
      current = current.next;
    }
    return dummyHead.next;
  }
}

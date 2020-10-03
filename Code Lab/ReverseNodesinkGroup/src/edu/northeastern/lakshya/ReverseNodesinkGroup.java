package edu.northeastern.lakshya;

public class ReverseNodesinkGroup {
  public ListNode reverseKGroup(ListNode head, int k) {
  int count = 0;
  ListNode current = head, next;
  while (current != null && count < k) {
    current = current.next;
    count++;
  }
  if (count == k) {
    current = reverseKGroup(current, k);
    while (count-- > 0) {
      next = head.next;
      head.next = current;
      current = head;
      head = next;
    }
    return current;
  }
  return head;
}
}

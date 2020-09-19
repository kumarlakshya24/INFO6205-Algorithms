package edu.northeastern.lakshya;
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
public class RemoveNthFromEnd {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode temp = head;
    int count = 0;
    while(temp != null) {
      temp = temp.next;
      count++;
    }
    if(n == count) {
      return head.next;
    }
    temp = head;
    int remove = count -n;
    while(remove-- > 1) {
      temp = temp.next;
    }
    if(temp.next != null) {
      temp.next = temp.next.next;
      return head;
    }
    return null;
  }
}

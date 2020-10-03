package edu.northeastern.lakshya;

public class SwapNodesinPairs {
  public ListNode swapPairs(ListNode head) {
  if(head == null || head.next == null) {
    return head;
  }

  ListNode newHead = head.next;
  ListNode p = head;
  ListNode preHead = new ListNode(0);
  while( p != null ){
    preHead.next = swap(p);
    preHead = p;
    p = p.next;
  }
  return newHead;
  }

  private ListNode swap(ListNode head){
    if(head == null || head.next == null) {
      return head;
    }
    ListNode nextNode = head.next;
    ListNode nextHead = head.next.next;
    nextNode.next = head;
    head.next = nextHead;
    return nextNode;
  }
}

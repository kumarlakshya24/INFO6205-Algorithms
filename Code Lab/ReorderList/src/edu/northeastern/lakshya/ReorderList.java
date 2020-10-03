package edu.northeastern.lakshya;

public class ReorderList {{
  public void reorderList(ListNode head)
  {
    if(head == null || head.next == null)
      return;
    ListNode prev = getMid(head);
    ListNode mid = prev.next;
    prev.next = null;

    ListNode L1 = head;
    ListNode L2 = reverseList(mid);

    mergeList(L1, L2);
  }

  private ListNode getMid(ListNode head)
  {
    ListNode slow = head, fast = head.next;

    while(fast != null && fast.next != null)
    {
      fast = fast.next.next;
      slow = slow.next;
    }
    return slow;
  }

  private ListNode reverseList(ListNode head)
  {
    ListNode prev = null, current = head;

    while(current != null)
    {
      ListNode nextNode = current.next;
      current.next = prev;
      prev = current;
      current = nextNode;
    }
    return prev;
  }

  private void mergeList(ListNode L1, ListNode L2)
  {
    while(L2 != null)
    {
      ListNode n1 = L1.next;
      ListNode n2 = L2.next;

      L1.next = L2;
      L2.next = n1;

      L1 = n1;
      L2 = n2;
    }
  }
}

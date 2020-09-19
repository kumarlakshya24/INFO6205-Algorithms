package edu.northeastern.lakshya;
public class PartitionListAroundX {
  public static void main(String[] args) {

  }
  public static ListNode partition(ListNode head, int x) {
    ListNode lessListHead = new ListNode(0);
    ListNode greaterListHead = new ListNode(0);
    ListNode smallListPointer = lessListHead;
    ListNode biggerListPointer = greaterListHead;
    for(ListNode current = head; current != null; current = current.next) {
      if (current.val < x) {
        smallListPointer = smallListPointer.next = current;
      } else {
        biggerListPointer = biggerListPointer.next = current;
      }
    }
      biggerListPointer.next = null;
      smallListPointer.next = greaterListHead.next;
      return lessListHead.next;
    }
}
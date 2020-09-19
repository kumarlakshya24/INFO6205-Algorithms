package edu.northeastern.lakshya;

public class ConvertBinaryToInteger {
  public static void main(String[] args) {
    ListNode h1 = new ListNode(1);
    ListNode h2 = new ListNode(0, h1);
    ListNode h3 = new ListNode(1, h2);
    System.out.println(getDecimalValue(h3)); //h3 = [1,0,1] Output = 5
  }

  public static int getDecimalValue(ListNode head) {
    int nodes = 0;
    ListNode node = head;
    while (node != null) {
      nodes++;
      node = node.next;
    }

    int sum = 0;
    while (head != null) {
      if (head.val == 1) {
        sum += Math.pow(2, nodes - 1);
      }
      nodes--;
      head = head.next;
    }
    return sum;
  }
}
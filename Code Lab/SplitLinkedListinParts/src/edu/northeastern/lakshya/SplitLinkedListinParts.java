package edu.northeastern.lakshya;

public class SplitLinkedListinParts {
  public ListNode[] splitListToParts(ListNode root, int k) {
    ListNode[] ans = new ListNode[k];
    int length = 0;
    ListNode node = root;
    while (node != null) {
      length++;
      node = node.next;
    }
    int m = length / k, p = length % k;
    node = root;
    for (int i = 0; i < k && node != null; i++) {
      ans[i] = node;
      int count = p-- > 0 ? m + 1 : m;
      while (count-- > 1) {
        node = node.next;
      }
      ListNode next = node.next;
      node.next = null;
      node = next;
    }
    return ans;
  }
}

package edu.northeastern.lakshya;

import java.util.ArrayList;
import java.util.List;

public class NextGreaterNodeInLinkedList {
  public int[] nextLargerNodes(ListNode head) {
    List<Integer> list = new ArrayList<>();
    if(head == null){
      return null;
    }
    if(head.next == null){
      int[] result = new int[1];
      return result;
    }
    while(head != null){
      ListNode node = head.next;
      while(node != null && head.val >= node.val){
        node = node.next;
      }

      if(node != null){
        list.add(node.val);
        head = head.next;
      }
      else{
        list.add(0);
        head = head.next;
      }
    }
    int[] result = new int[list.size()];
    for(int i=0; i < list.size(); i++){
      result[i] = list.get(i);
    }
    return result;
  }
}

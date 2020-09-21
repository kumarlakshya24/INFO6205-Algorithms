package edu.northeastern.lakshya;

public class InsertIntoSortedLinkedList {
  public static void main(String[] args){
  }

  public Node insert(Node head, int insertVal) {
    if(head==null) {
      Node res = new Node();
      res.val = insertVal;
      res.next = res;
      return res;
    }
    Node max = head;
    while(max.val <= max.next.val && max.next !=head) {
      max = max.next;
    }

    Node min = max.next;
    Node cur = min;
    if(insertVal <= min.val || insertVal >= max.val) {
      max.next = new Node(insertVal, min);
    }
    else {
      while (cur.next != null && cur.next.val < insertVal) {
        cur = cur.next;
        cur.next = new Node(insertVal, cur.next);
      }
    }
    return head;
  }
}


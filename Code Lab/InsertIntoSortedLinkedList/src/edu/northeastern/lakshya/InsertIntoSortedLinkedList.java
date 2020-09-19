package edu.northeastern.lakshya;

public class InsertIntoSortedLinkedList {
  public static void main(String[] args) {
    System.out.println("");
  }

  private Node insert(Node head, int insertVal) {
    if (head == null) {
      head = new Node(insertVal, null);
      head.next = head;
      return head;
    }
    return head;
  }
}


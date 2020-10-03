package src.edu.northeastern.lakshya;
import edu.northeastern.lakshya.ListNode;

class DeleteNodes {
  int mNode, nNode;
  public ListNode deleteNodes(ListNode head, int m, int n) {
    mNode = m;
    nNode = n;
    return recursiveRemover(head, m, n);
  }

  ListNode recursiveRemover(ListNode head, int m, int n){
    if(head == null) {
      return null;
    }
    if(n == 0){
      m = mNode;
      n = nNode;
    }
    if(m > 0){
      head.next = recursiveRemover(head.next, m-1, n);
      return head;
    }
    else {
      return recursiveRemover(head.next, m, n-1);
    }
  }
}
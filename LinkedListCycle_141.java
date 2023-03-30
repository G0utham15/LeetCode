public class LinkedListCycle_141 {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public boolean hasCycle(ListNode head) {
        ListNode fast=head,slow=head;
        while(true){
            if(fast==null) return false;
            if(fast.next==null){
                return false;
            } else if (fast.next.next==null) {
                return false;
            }
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) return true;
        }
    }
}

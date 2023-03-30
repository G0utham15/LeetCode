
public class ReverseLinkedList_206 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode prev=null,curr=head,fut=head.next;
        while(head.next!=null){
            head=head.next;
        }
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=fut;
            if(fut!=null)
                fut=curr.next;
        }
        return head;
    }
}

public class RemoveLinkedListElements_203 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode temp=head;
        while(true){
            if(head==null) return head;
            if(head.val==val){
                head=head.next;
                temp.next=null;
                temp=head;
            }else{
                break;
            }
        }
        temp=head.next;
        ListNode prev=head;
        while(temp!=null){
            if(temp.val==val){
                prev.next=temp.next;
                temp.next=null;
                temp=prev.next;
            }else{
                temp=temp.next;
                prev=prev.next;
            }

        }
    return head;
    }
}

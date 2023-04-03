public class RemoveNthNodeFromEndOfList_19 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if(length==1) return null;
        temp=head;
        ListNode prev;
        length=length-n;
        if(length==0) return head.next;
        while(length>0){
            length--;
            prev=temp;
            temp=temp.next;
            if(length==0){
                prev.next=temp.next;
            }
        }
        return head;
    }
}

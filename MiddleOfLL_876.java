public class MiddleOfLL_876 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode middleNode(ListNode head) {
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int mid= (int) Math.floor((double) length /2);
        temp=head;
        while(mid>0){
            temp=temp.next;
            mid--;
        }
        return temp;
    }
}

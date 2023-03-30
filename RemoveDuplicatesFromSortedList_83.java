
import java.util.Arrays;

public class RemoveDuplicatesFromSortedList_83 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    /* This will also Work for Unsorted List
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        int[] freq=new int[201];
        Arrays.fill(freq,0);
        ListNode temp=head,next=null;
        freq[temp.val+100]=1;
        while(temp.next!=null){
            next=temp.next;
            if(freq[next.val+100]==0){
                freq[next.val+100]++;
            }else if(freq[next.val+100]==1){
                temp.next=next.next;
                next.next=null;
                continue;
            }
            temp=temp.next;
        }
        return head;
    }*/
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode curr=head.next,prev=head;
        while(curr!=null){
            if(prev.val==curr.val){
                prev.next=curr.next;
                curr.next=null;
                curr=prev.next;
                continue;
            }else{
                prev=curr;
            }
            curr=curr.next;
        }
        //System.gc(); // Clear un used nodes to reduce Memory Usage
        return head;
    }
}

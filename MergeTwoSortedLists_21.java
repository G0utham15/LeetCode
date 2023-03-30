public class MergeTwoSortedLists_21 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode res;
        if(list1.val>list2.val){
            res=new ListNode(list2.val);
            list2=list2.next;
        }else{
            res=new ListNode(list1.val);
            list1=list1.next;
        }
        ListNode temp=res;
        while(true){
            if(list1==null){
                temp.next=list2;
                return res;
            } else if (list2==null) {
                temp.next=list1;
                return res;
            }
            if(list1.val>list2.val){
                temp.next=new ListNode(list2.val);
                list2=list2.next;
            }else{
                temp.next=new ListNode(list1.val);
                list1=list1.next;
            }
            temp=temp.next;
        }
    }

}

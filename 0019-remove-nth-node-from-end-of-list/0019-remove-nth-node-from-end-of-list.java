class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        ListNode dummy =new ListNode(0);
        dummy.next=head;
        ListNode s=dummy,f=dummy;
        for(int i=0;i<n;i++) f=f.next;
        while(f.next!=null){
            s=s.next;
            f=f.next;
        }
        s.next=s.next.next;
        return dummy.next;
    }
}
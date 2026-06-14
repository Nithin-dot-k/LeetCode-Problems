/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode a=null,b=head,c=head.next;
        while(b!=null){
            b.next=a;
            a=b;
            b=c;
            if(c!=null) c=c.next;
        }
        return a;
    }
    public int pairSum(ListNode head) {
        ListNode s=head,f=head;
        while(f!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode h2=reverse(s);
        int max=0;
        ListNode h1=head;
        while(h2!=null){
            max=Math.max(max,(h1.val+h2.val));
            h1=h1.next;
            h2=h2.next;
        }
        return max;
    }
}
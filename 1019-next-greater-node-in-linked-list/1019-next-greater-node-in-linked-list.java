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
    public int[] nextLargerNodes(ListNode head) {
        HashMap<ListNode,Integer> hm=new HashMap<>();
        Stack<ListNode> st=new Stack<>();
        ListNode cur=head;
        int n=0;
        while(cur!=null){
            if(st.empty()){
                st.push(cur);
                cur=cur.next;
            }
            else{
                while(!st.isEmpty() && cur.val>st.peek().val){
                    hm.put(st.pop(),cur.val);
                }
                st.push(cur);
                cur=cur.next;
            }
            n++;
        }
        while(!st.isEmpty()){
            hm.put(st.pop(),0);
        }
        int arr[]=new int[n];
        cur=head;
        int i=0;
        while(cur!=null){
            arr[i++]=hm.get(cur);
            cur=cur.next;
        }
        return arr;
    }
}
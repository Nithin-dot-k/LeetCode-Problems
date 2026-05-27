class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums2){
            while(!st.isEmpty() && i>st.peek()) hm.put(st.pop(),i);
            st.push(i);
        }
        while(!st.isEmpty()) hm.put(st.pop(),-1);
        for(int i=0;i<nums1.length;i++){
            nums1[i]=hm.get(nums1[i]);
        }
        return nums1;
    }
}
class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer> st=new Stack<>();
        for(int i:nums){
            if(st.isEmpty()) st.push(i);
            else{
                if(st.peek()<=i) st.push(i);
            }
        }
        return st.size();
    }
}
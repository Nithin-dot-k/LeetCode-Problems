class Solution {
    public int[] dailyTemperatures(int[] tem) {
        Stack<Integer> st=new Stack<>();
        int res[]=new int[tem.length];
        for(int i=0;i<tem.length;i++){
            while(!st.isEmpty() && tem[st.peek()]<tem[i]){
                res[st.peek()]=i-st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            res[st.pop()]=0;
        }
        return res;
    }
}
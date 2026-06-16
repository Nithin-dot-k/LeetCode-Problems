class Solution {
    public int[] asteroidCollision(int[] arr) {   
        Stack<Integer> st=new Stack<>();
        for(int i:arr){
            int abs=Math.abs(i);
            if(i<0){
                while(!st.isEmpty() && st.peek()>0 && st.peek()<abs){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()>0 && st.peek()==abs){
                    st.pop();
                    continue;
                }
                if(!st.isEmpty() && st.peek()>0 && st.peek()>abs) continue;
                st.push(i);
            }
            else{
                st.push(i);
            }
        }
        int []res=new int[st.size()];
        int i=st.size()-1;
        while(!st.isEmpty()){
            res[i--]=st.pop();
        }
        return res;
    }
}


class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        int []arr=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty()) st.push(i);
            else if(s.charAt(i)==')' && s.charAt(st.peek())=='('){
                arr[i]=1;
                arr[st.pop()]=1;   
            }
            else st.push(i);
        }
        int res=0,sum=0;
        for(int i:arr){
            if(i==0){
                sum=0;
            }
            // System.out.print(i+" ");
            sum+=i;
            res=Math.max(res,sum);
        }
        return res;
    }
}
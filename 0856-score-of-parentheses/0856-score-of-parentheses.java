class Solution {
    public int scoreOfParentheses(String s) {
        Stack<String> st=new Stack<>();
        int n=s.length(),i=0;
        while(i<n){
            String c=""+s.charAt(i);
            if(c.equals(")")){
                int cnt=0,cur=0;
                System.out.println(st);
                while(!st.peek().equals("(")){
                    cur+=Integer.parseInt(st.pop());
                    cnt++;
                }
                if(cnt==1){
                    String t=""+(cur*2);
                    st.pop();
                    st.push(t);
                    i++;
                }
                else if(cnt>1){
                    String t=""+cur;
                    st.push(t);
                }
                else{
                    st.pop();
                    st.push("1");
                    i++;
                }
            }
            else{
                st.push("(");
                i++;
            }
        }
        int res=0;
        while(!st.isEmpty()){
            res+=Integer.parseInt(st.pop());
        }
        return res;
    }
}
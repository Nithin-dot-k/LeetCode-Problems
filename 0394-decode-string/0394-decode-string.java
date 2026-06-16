class Solution {
    public String decodeString(String s) {
        Stack<Character> st=new Stack<>();
        Stack<Integer> num=new Stack<>();
        int in=0;
        while(in<s.length()){
            if(s.charAt(in)==']'){
                StringBuilder sb=new StringBuilder();
                while(st.peek()!='['){
                    sb.append(st.pop());
                }
                st.pop();
                sb.reverse();
                int n=num.pop();
                String t=sb.toString();
                for(int i=0;i<n-1;i++){
                    sb.append(t);
                }
                for(char c:sb.toString().toCharArray()){
                    st.push(c);
                }
            }
            else{
                if(Character.isDigit(s.charAt(in))){
                    String a="";
                    while(Character.isDigit(s.charAt(in))){
                        a+=s.charAt(in);
                        in++;
                    }
                    num.push(Integer.parseInt(a));
                }
                st.push(s.charAt(in));
            }
            in++;
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        res.reverse();
        return res.toString();
    }
}
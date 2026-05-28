class Solution {
    public String removeDuplicateLetters(String s) {
        int lastIdx[]=new int[26];
        for(int i=0;i<s.length();i++){
            lastIdx[s.charAt(i)-'a']=i;
        }
        boolean []seen=new boolean[26];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            int cur=s.charAt(i)-'a';
            if(seen[cur]) continue;
            while(!st.isEmpty() && st.peek()>cur && i<lastIdx[st.peek()]){
                seen[st.pop()]=false;
            }
            st.push(cur);
            seen[cur]=true;
        }

        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append((char)(st.pop()+'a'));
        }
        return sb.reverse().toString();
    }
}
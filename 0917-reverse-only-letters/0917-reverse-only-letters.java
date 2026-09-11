class Solution {
    public String reverseOnlyLetters(String st) {
        int s=0,l=st.length()-1,n=st.length();
        char[]c=st.toCharArray();
        while(s<=l){
            while(s<l && !Character.isLetter(c[s])) s++;
            while(s<l && !Character.isLetter(c[l])) l--;

            char t=c[s];
            c[s]=c[l];
            c[l]=t;
            s++;
            l--;
        }
        // String str="";
        // for(char ch:c){
        //     str+=ch;
        // }
        return new String(c);
    }
}
class Solution {
    public boolean check(String str){
        int l=0,r=str.length()-1;
        while(l<=r){
            if(str.charAt(l)!=str.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int cnt=0;
        for(int i=0;i<s.length();i++){
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<s.length();j++){
                sb.append(s.charAt(j));
                if(check(sb.toString())) cnt++;
            }
        }
        return cnt;
    }
}
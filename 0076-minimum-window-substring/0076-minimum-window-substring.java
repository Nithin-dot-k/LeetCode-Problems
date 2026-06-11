class Solution {
    public String minWindow(String s, String t) {
         int map[]=new int[256];
        if(s.length()==0 || t.length()==0 || s.length()<t.length()) return "";
        for(char c:t.toCharArray()){
            map[c]++;
        }
        int cnt=t.length(),n=s.length(),l=0,r=0,minlen=Integer.MAX_VALUE,minst=0;
        while(r<n){
            char c1=s.charAt(r);
            if(map[c1]>0) cnt--;
            map[c1]--;
            r++;
            while(cnt==0){
                if(r-l<minlen){
                    minlen=r-l;
                    minst=l;
                }
                char c2=s.charAt(l);
                map[c2]++;
                if(map[c2]>0) cnt++;
                l++;
            }
        }
        return (minlen==Integer.MAX_VALUE)?"":s.substring(minst,minst+minlen);
    }
}
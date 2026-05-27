class Solution {
    public int numberOfSpecialChars(String word) {
        int []uc=new int[26];
        int []lc=new int[26];
        int cnt=0;
        Arrays.fill(uc,-1);
        Arrays.fill(lc,-1);
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z'){
                if(uc[ch-'a']!=-1){
                    lc[ch-'a']=-1;
                }else{
                    lc[ch-'a']=i;
                }
            }
            else{
                uc[ch-'A']++;
            }
        }
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='A' && ch<='Z'){
                if(lc[ch-'A']!=-1 && lc[ch-'A']<i){
                    cnt++;
                    lc[ch-'A']=-1;
                }
            }
        }
        return cnt;
    }
}
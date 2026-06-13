class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res="";
        for(String s:words){
            int t=0;
            for(int i=0;i<s.length();i++){
                t+=weights[s.charAt(i)-'a'];
            }
            int pos=t%26;
            t=26-pos;
            res+=(char)(96+t);
        }
        return res;
    }
}
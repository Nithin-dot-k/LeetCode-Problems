class Solution {
    public String convert(String s, int n) {
        char [][]ch=new char[n][s.length()];
        int i=0,j=0;
        boolean f=false;
        if(s.length()<=n || n==1) return s;
        for(char c:s.toCharArray()){
            ch[i][j]=c;
            if(!f){
                i++;
            }
            else{
                i--;
                j++;
            }
            if(i==n-1) f=true;
            if(i==0) f=false;
        }
        StringBuilder sb=new StringBuilder();
        for(char a[]:ch){
            for(char b:a){
                if(Character.isLetter(b) || b==',' || b=='.') sb.append(b);
            }
        }
        return sb.toString();
    }
}
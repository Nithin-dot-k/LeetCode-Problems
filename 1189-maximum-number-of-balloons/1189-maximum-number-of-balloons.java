class Solution {
    public int maxNumberOfBalloons(String text) {
        boolean f=true;
        int cnt=0;
        while(f){
            String str="balloon";
            for(char c:str.toCharArray()){
                if(text.indexOf(""+c)==-1){
                    return cnt;
                }
                text=text.replaceFirst(""+c,"");
            }
            cnt++;
        }
        return cnt;
    }
}
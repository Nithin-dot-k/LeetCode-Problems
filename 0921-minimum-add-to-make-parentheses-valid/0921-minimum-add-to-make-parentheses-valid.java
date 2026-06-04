class Solution {
    public int minAddToMakeValid(String s) {
        int ocnt=0,ccnt=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') ocnt++;
            else{
                if(ocnt>0) ocnt--;
                else ccnt++;
            }
        }
        return ocnt+ccnt;
    }
}
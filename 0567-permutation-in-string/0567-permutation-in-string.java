class Solution {
    public boolean check(int st,int end,String s1,String s2){
        int []arr=new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
        }
        for(int i=st;i<end;i++){
            arr[s2.charAt(i)-'a']--;
        }
        for(int i:arr){
            if(i!=0) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        for(int i=0;i<s2.length()-n+1;i++){
            if(check(i,i+n,s1,s2)) return true;
        }
        return false;
    }
}
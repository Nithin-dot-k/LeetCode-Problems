class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,max=0;
        Set<Character> set=new HashSet<>();
        while(r<s.length()){
            char c=s.charAt(r);
            while(set.contains(c) && l<r){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}
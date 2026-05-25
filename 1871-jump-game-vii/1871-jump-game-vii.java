class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n=s.length();
        boolean []res=new boolean[n];
        res[0]=true;
        List<Integer> l=new ArrayList<>();
        l.add(0+minJump);
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='0' && res[i]){
                int min=i+minJump;
                int max=i+maxJump;
                if(min<n && s.charAt(min)=='0') res[min]=true;
                if(max<n && s.charAt(max)=='0') res[max]=true;
                for(int j=Math.max(min,l.get(l.size()-1));j<max;j++){
                    if(j<n && s.charAt(j)=='0') res[j]=true;
                    l.add(j);
                }
                System.out.println(min+" "+max);
            }
        }
        return res[n-1];
    }
}
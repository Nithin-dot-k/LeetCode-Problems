class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m*k>bloomDay.length) return -1;
        int l=1,h=(int)1e9;
        while(l<h){
            int mid=l+(h-l)/2;
            int tot=0;
            for(int i=0;i<bloomDay.length;i++){
                int cnt=0;
                while(i<bloomDay.length && cnt<k && bloomDay[i]<=mid){
                    i++;
                    cnt++;
                }
                if(cnt==k){
                    tot++;
                    i--;
                }
                if(tot>=m){
                    break;
                }
            }
            if(tot>=m){
                h=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}
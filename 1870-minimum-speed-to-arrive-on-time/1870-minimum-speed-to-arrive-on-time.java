class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int l=1,r=(int)1e7;
        int ans=-1;
        while(l<=r){
            int mid= l+(r-l)/2;
            double res=0;
            for(int i=0;i<dist.length;i++){
                double time=dist[i]*1.0/mid;
                if(i!=dist.length-1) res+=Math.ceil(time);
                else res+=time;
                if(res>hour) break;
            }
            if(res<=hour){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0,tot=0;
        for(int i:weights){
            tot+=i;
            l=Math.max(i,l);
        }
        while(l<tot){
            int mid=(tot+l)/2;
            int d=0,p=0;
            for(int i:weights){
                if(p+i>mid){
                    d++;
                    p=i;
                }
                else{
                    p+=i;
                }
            }
            if(d<days){
                tot=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}
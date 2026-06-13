class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1,max=-1;
        for(int i:piles){
            max=Math.max(i,max);
        }
        int k=0;
        while(min<=max){
            int mid=(min+max)/2;
            long hrs=0;
            for(int i:piles){
                hrs+=(i+mid-1)/mid;
            }
            if(hrs<=h){
                k=mid;
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return k;
    }
}
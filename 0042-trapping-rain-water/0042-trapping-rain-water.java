class Solution {
    public int trap(int[] arr) {
        int l=0,r=arr.length-1;
        int lm=0,rm=0,tot=0;
        while(l<r){
            if(arr[l]<arr[r]){
                if(arr[l]>lm) lm=arr[l];
                else tot+=lm-arr[l];
                l++;
            }
            else{
                if(arr[r]>rm) rm=arr[r];
                else tot+=rm-arr[r];
                r--;
            }
        }
        return tot;
    }
}
class Solution {
    public int trap(int[] arr) {
        int i=0,j=arr.length-1,tot=0;
        int lm=0,rm=0;
        while(i<j){
            if(arr[i]<=arr[j]){
                if(arr[i]>=lm) lm=arr[i];
                else tot+=lm-arr[i];
                i++;
            }
            else{
                if(arr[j]>=rm) rm=arr[j];
                else tot+=rm-arr[j];
                j--;
            }
        }
        return tot;
    }
}
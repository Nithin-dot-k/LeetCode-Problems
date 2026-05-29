class Solution {
    public int maxScore(int[] arr, int k) {
        int res=0;
        for(int i=0;i<k;i++){
            res+=arr[i];
        }
        int max=res;
        int n=arr.length;
        for(int i=0;i<k;i++){
            res=res+arr[n-i-1]-arr[k-i-1];
            max=Math.max(max,res);
        }
        return max;
    }
}
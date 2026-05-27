class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=-1;
            for(int j=1;j<n;j++){
                int ind=(i+j)%n;
                if(nums[ind]>nums[i]){
                    res[i]=nums[ind];
                    break;
                }
            }
        }
        return res;
    }
}
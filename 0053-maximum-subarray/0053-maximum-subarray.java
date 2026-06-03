class Solution {
    public int maxSubArray(int[] nums) {
        int cur=0,max=nums[0];
        for(int i:nums){
            cur=Math.max(cur+i,i);
            max=Math.max(cur,max);
        }
        return max;
    }
}
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum=nums[0],cursum=nums[0],curmin=nums[0];
        int minsum=nums[0],t=nums[0];
        for(int i=1;i<nums.length;i++){
            t+=nums[i];
            cursum=Math.max(cursum+nums[i],nums[i]);
            curmin=Math.min(curmin+nums[i],nums[i]);
            maxsum=Math.max(cursum,maxsum);
            minsum=Math.min(curmin,minsum);
        }
        if(maxsum<0) return maxsum;
        return Math.max(maxsum,t-minsum);
    }
}
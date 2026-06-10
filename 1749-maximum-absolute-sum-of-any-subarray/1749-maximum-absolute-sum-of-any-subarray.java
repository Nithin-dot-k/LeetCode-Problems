class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum=0,minsum=0,max=0,min=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max+nums[i],nums[i]);
            maxsum=Math.max(maxsum,max);

            min=Math.min(min+nums[i],nums[i]);
            minsum=Math.min(minsum,min);
        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}
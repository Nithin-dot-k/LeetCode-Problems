class Solution {
    public int maxProduct(int[] nums) {
        int cur=nums[0],min=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            int a=Math.max(Math.max(cur*nums[i],nums[i]*min),nums[i]);
            int b=Math.min(Math.min(cur*nums[i],min*nums[i]),nums[i]);
            cur=a;
            min=b;
            max=Math.max(max,cur);
        }
        return max;
    }
}
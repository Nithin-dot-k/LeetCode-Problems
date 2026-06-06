class Solution {
    public int[] leftRightDifference(int[] nums) {
        int []res=new int[nums.length];
        int n=nums.length,left=0,right=0;
        for(int i:nums){
            right+=i;
        }
        for(int i=0;i<n;i++){
            right-=nums[i];
            res[i]=Math.abs(left-right);
            left+=nums[i];
        }
        return res;
    }
}
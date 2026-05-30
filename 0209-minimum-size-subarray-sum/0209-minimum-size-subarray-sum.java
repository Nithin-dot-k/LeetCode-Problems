class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length,min=n,si=0;
        if(nums[0]>=target) return 1;
        int sum=nums[si];   
        for(int li=1;li<n;li++){
            sum+=nums[li];
            while(sum>=target){
                if(li-si+1 < min) min=li-si+1;
                sum-=nums[si];
                si++;
            }
        }
        if(sum<target && si==0) return 0;
        return min;
    }
}
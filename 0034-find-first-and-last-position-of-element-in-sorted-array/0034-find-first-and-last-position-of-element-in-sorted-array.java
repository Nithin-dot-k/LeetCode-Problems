class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0,l=nums.length-1;
        while(s<=l){
            int mid=(s+l)/2;
            if(nums[mid]==target){
                int i=mid,j=mid;
                while(i>=0 && nums[i]==target) i--;
                while(j<nums.length && nums[j]==target) j++;
                return new int[]{i+1,j-1};
            }
            if(target<nums[mid]) l=mid-1;
            else s=mid+1;
        }
        return new int[]{-1,-1};
    }
}
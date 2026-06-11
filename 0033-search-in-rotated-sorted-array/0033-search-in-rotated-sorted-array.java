class Solution {
    public int search(int[] nums, int target) {
        int s=0,l=nums.length-1;
        while(s<=l){
            int mid=(s+l)/2;
            if(nums[mid]==target) return mid;

            if(nums[mid]>=nums[s]){
                if(nums[s]<=target && target<=nums[mid]) l=mid-1;
                else s=mid+1;
            }
            else{
                if(target>=nums[mid] && target<=nums[l]) s=mid+1;
                else l=mid-1;
            }
        }
        return -1;
    }
}
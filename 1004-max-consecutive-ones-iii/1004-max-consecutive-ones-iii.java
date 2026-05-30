class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,ocnt=0,max=0;
        while(j<nums.length){
            if(nums[j]==0) ocnt++;
            if(ocnt>k){
                while(i<=j && ocnt>k){
                    if(nums[i]==0) ocnt--;
                    i++;
                }
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
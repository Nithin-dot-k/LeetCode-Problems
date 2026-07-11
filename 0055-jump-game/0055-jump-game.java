class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        boolean []b=new boolean[nums.length];
        b[0]=true;
        for(int i=0;i<nums.length;i++){
            if(b[i]){
                for(int j=i;j<Math.min(nums.length,i+nums[i]+1);j++){
                    b[j]=true;
                }
                if(b[nums.length-1]) return true;
            }
        }
        return false;
    }
}
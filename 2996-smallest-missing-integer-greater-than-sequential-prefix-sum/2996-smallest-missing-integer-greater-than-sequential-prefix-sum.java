class Solution {
    public int missingInteger(int[] nums) {
        List<Integer> li=new ArrayList<>();
        for(int i:nums){
            li.add(i);
        }
        boolean flag = true;
        int sum = 0;
       for(int i=1;i<nums.length;i++)
       {
            if(nums[i-1]+1 == nums[i])
            {
                sum += nums[i-1];
            }
            else
            {
                sum += nums[i-1];
                flag = false;
                break;
            }
       }
       if(flag) sum += nums[nums.length-1];
       while(li.contains(sum))
       {
        sum++;
       }
       return sum;
    }
}
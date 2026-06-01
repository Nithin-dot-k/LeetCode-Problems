class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> d=new ArrayDeque<>();
        int j=0;
        int []res=new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            if(!d.isEmpty() && d.getFirst()==i-k){
                d.removeFirst();
            }
            while(!d.isEmpty() && nums[d.getLast()]<nums[i]){
                d.removeLast();
            }
            d.add(i);
            if(i>=k-1){
                res[j++]=nums[d.getFirst()];
            }
        }
        return res;
    }
}
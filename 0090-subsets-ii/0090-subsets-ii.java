class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void back(List<Integer> li,int[] nums,int in){
        if(!res.contains(li)) res.add(new ArrayList<>(li));

        for(int i=in;i<nums.length;i++){
            li.add(nums[i]);
            back(li,nums,i+1);
            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        back(new ArrayList<>(),nums,0);
        return res;
    }
}
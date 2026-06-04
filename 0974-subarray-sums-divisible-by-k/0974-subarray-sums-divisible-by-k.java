class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int cnt=0,sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i:nums){
            sum+=i;
            int t=sum%k;
            if(t<0){
                t+=k;
            }
            if(map.containsKey(t)){
                cnt+=map.get(t);
                map.put(t,map.get(t)+1);
            }
            else{
                map.put(t,1);
            }
        }
        return cnt;
    }
}
class Solution {
    public int totalFruit(int[] arr) {
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        int end=0,start=0,maxlen=0;
        while(end<n){
            map.put(arr[end],map.getOrDefault(arr[end],0)+1);
            while(map.size()>=3){
                map.put(arr[start],map.get(arr[start])-1);
                if(map.get(arr[start])==0){
                    map.remove(arr[start]);
                }
                start++;
            }
            int cur=end-start+1;
            maxlen=Math.max(maxlen,cur);
            end++;
        }
        return maxlen;
    }
}
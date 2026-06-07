class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> li=new ArrayList<>(map.entrySet());
        Collections.sort(li,(a,b) -> b.getValue() - a.getValue());

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<li.size();i++){
            for(int j=0;j<li.get(i).getValue();j++){
                sb.append(li.get(i).getKey());
            }
        }
        return sb.toString();
    }
}
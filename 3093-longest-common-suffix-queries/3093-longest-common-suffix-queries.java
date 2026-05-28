class Solution {
    class TrieNode{
        TrieNode[] child=new TrieNode[26];
        int bestLen=Integer.MAX_VALUE;
        int bestIdx=Integer.MAX_VALUE;
    }
    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
        TrieNode root=new TrieNode();

        for(int i=0;i<wordsContainer.length;i++){
            String word=wordsContainer[i];
            int len=word.length();
            TrieNode cur=root;
            if(len<cur.bestLen || (len==cur.bestLen && i<cur.bestIdx)){
                cur.bestLen=len;
                cur.bestIdx=i;
            }
            for(int j=len-1;j>=0;j--){
                int charIdx=word.charAt(j)-'a';
                if(cur.child[charIdx]==null){
                    cur.child[charIdx]=new TrieNode();
                }
                cur=cur.child[charIdx];
                if(len<cur.bestLen || (len==cur.bestLen && i<cur.bestIdx)){
                    cur.bestLen=len;
                    cur.bestIdx=i;
                }
            }
        }
        int res[]=new int[wordsQuery.length];
        for(int i=0;i<wordsQuery.length;i++){
            String query=wordsQuery[i];
            int len=query.length();
            TrieNode cur=root;

            for(int j=len-1;j>=0;j--){
                int charIdx=query.charAt(j)-'a';
                if(cur.child[charIdx]==null) break;
                cur=cur.child[charIdx];
            }
            res[i]=cur.bestIdx;
        }
        return res;
    }
}
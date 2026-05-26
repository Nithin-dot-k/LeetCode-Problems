class Solution {
    List<String> res=new ArrayList<>();
    public void back(StringBuilder sb,int ob,int cb,int n){
        if(sb.length()==n*2){
            res.add(sb.toString());
            return;
        }
        if(ob<n){
            sb.append("(");
            back(sb,ob+1,cb,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(cb<ob){
            sb.append(")");
            back(sb,ob,cb+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        back(new StringBuilder(),0,0,n);
        return res;
    }
}
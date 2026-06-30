class Solution {
    public int[][] merge(int[][] a) {
        Arrays.sort(a,Comparator.comparingInt(ar -> (ar[0])));
        int i=0,n=a.length;
        List<List<Integer>> res=new ArrayList<>();
        while(i<n){
            int imax=a[i][1],j=i+1;
            List<Integer> l=new ArrayList<>();
            while(j<n && a[j][0]<=imax){
                if(a[j][1]>imax) imax=a[j][1];
                j++;
            }
            l.add(a[i][0]);
            l.add(imax);
            res.add(l);
            i=j;
        }
        int a2[][]=new int[res.size()][2];
        for(int k=0;k<res.size();k++){
            for(int j=0;j<2;j++){
                a2[k][j]=res.get(k).get(j);
            }
        }
        return a2;
    }
}
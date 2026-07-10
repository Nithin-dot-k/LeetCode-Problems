class Solution {
    public void rotate(int[] nums, int k) {
        while(nums.length<k){
            k-=nums.length;
         }
        int i=0,j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        int m=0,n=k-1;
        while(m<n){
            int temp=nums[m];
            nums[m]=nums[n];
            nums[n]=temp;
            m++;
            n--;
        }
        int a=k,b=nums.length-1;
        while(a<b){
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            a++;
            b--;
        }
    }
}

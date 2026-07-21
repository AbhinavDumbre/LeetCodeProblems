class Solution {
    public int[] concatWithReverse(int[] nums) {
          int n=nums.length;
        int ans[]=new int[n*2];
      
       for(int i=0;i<nums.length;i++){
        ans[i]=nums[i];
       }
       int j=n;
       for(int i=n-1;i>=0;i--){
        ans[j]=nums[i];
        j++;
       }
    return ans;}
}
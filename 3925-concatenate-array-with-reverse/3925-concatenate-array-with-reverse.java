class Solution {
    public int[] concatWithReverse(int[] nums) {
        int ans[]=new int[nums.length*2];
       for(int i=0;i<nums.length;i++){
        ans[i]=nums[i];
       }
       int j=nums.length;
       for(int p=nums.length-1;p>=0;p--){
        ans[j]=nums[p];
        j++;
       }
    return ans;}
}
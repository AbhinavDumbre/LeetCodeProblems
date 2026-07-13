class Solution {
    public int missingNumber(int[] nums) {
        int xorsum=0;
        for(int num:nums){
            xorsum=xorsum^num;
        }
        int n=nums.length;
        for(int i=0;i<=n;i++ ){
            xorsum=xorsum^i;
        }
        return xorsum;


    }
}
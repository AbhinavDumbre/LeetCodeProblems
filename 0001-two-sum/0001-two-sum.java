class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int arr[]=new int[2];
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++){
                if(nums[j]+nums[j-i]==target){
                    arr[0]=j-i;
                    arr[1]=j;
                    return arr;
                }
            }

        }return arr;
    }
}
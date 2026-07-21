class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
        int i=0;
        int m=0;
        int j=n;
        while(i<n){
            if(j<nums.length &&i<n){
            arr[m]=nums[i];
            arr[m+1]=nums[j];
            
            m=m+2;
            i++;
            j++;}
    
        }return arr;
    }
}
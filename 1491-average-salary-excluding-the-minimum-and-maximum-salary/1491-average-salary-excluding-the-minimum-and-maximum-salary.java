class Solution {
    public double average(int[] arr) {
        double sum=0;
        double max=arr[0];
        double min=arr[0];
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
            sum+=arr[i];
        }sum=sum-max-min;
        double total=arr.length-2;
        double avg=sum/total;
        return avg;
    }
}
class Solution {
    static int pivotElement(int arr[]){
         int n=arr.length;
        int s=0;
        int e=n-1;
        int ans=-1;
        if(arr[s]<arr[e]){
            return ans;
        }

        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<=arr[n-1]){
                
                e=mid-1;
            }
            else{
                ans=mid;
                s=mid+1;            }
        }return ans;
    }
    static int BinarySearch(int arr[],int s,int e,int target){
        while (s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }return -1;
    }
    public int search(int[]arr, int target) {
        int n=arr.length;
       int pivotIndex=pivotElement(arr);
       if(pivotIndex==-1){
         int ans=BinarySearch(arr,0,n-1,target);
    return ans;
       }else{
        int startingIndex= 0;
       int endingIndex=pivotIndex;
        int newStartingIndex=pivotIndex+1;
        int newEndingIndex=n-1;

        if(target>=arr[startingIndex] && target<=arr[endingIndex]){
            int ans=BinarySearch(arr,startingIndex,endingIndex,target);
            return ans;
        }
        if(target>=arr[newStartingIndex] && target<=arr[newEndingIndex]){
            int ans=BinarySearch(arr,newStartingIndex,newEndingIndex,target);
            return ans;
        }
        
       }return -1;
}}
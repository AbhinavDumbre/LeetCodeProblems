class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int totalrow=matrix.length;
       int totalcol=matrix[0].length;
       int s=0;
       int n=totalrow*totalcol;
       int e=n-1;
    while(s<=e){
        int mid=s+(e-s)/2;
        int row=mid/totalcol;
        int col=mid%totalcol;
        if(matrix[row][col]==target){
            return true;
        }
        if(matrix[row][col]>target){
            e=mid-1;
        }else{
            s=mid+1;
        }    }return false;
    
    }
}
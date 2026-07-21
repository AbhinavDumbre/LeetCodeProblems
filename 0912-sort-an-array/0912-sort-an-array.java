class Solution {
    public int[] sortArray(int[] arr) {
      for(int i=0;i<arr.length;i++) {
		int n=arr.length;
		int curr=i;
		int previous=i-1;
		int currvalue=arr[i];
		while(previous>=0 && currvalue<arr[previous]) {
			arr[previous+1]=arr[previous];
			previous--;
			
		}
		
		arr[previous+1]=currvalue;
		}return arr;
        }
    }

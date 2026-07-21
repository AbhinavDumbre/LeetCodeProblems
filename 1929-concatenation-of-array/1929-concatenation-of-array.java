class Solution {
    public int[] getConcatenation(int[] arr) {
        ArrayList<Integer>ar=new ArrayList<>();
        int k=0;
        while(k<2){
            for(int i=0;i<arr.length;i++){
                ar.add(arr[i]);
            }k++;
    
        
        }int[] a = ar.stream().mapToInt(Integer::intValue).toArray();return a ;
    }
}
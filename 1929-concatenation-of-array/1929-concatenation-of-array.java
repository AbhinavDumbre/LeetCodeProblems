class Solution {
    public int[] getConcatenation(int[] arr) {
        ArrayList<Integer>ar=new ArrayList<>();
        for(int j=0;j<2;j++){
            for(int i=0;i<arr.length;i++){
                ar.add(arr[i]);
            }
    
        }int[] a = ar.stream().mapToInt(Integer::intValue).toArray();return a ;
    }
}
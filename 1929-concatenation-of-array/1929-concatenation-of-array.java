class Solution {
    
    public int[] getConcatenation(int[] arr) {
          int[] result = new int[arr.length * 2];

for (int i = 0; i < arr.length; i++) {
    result[i] = arr[i];                 
    result[i + arr.length] = arr[i];    
}return result;
}}
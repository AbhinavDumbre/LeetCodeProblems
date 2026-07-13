class Solution {
    public int lengthOfLastWord(String s) {
        String copy=s;
        int l=0;
        
        copy=copy.trim();
        for(int i=copy.length()-1;i>=0;i--){
            
           if(copy.charAt(i)==32){
            break;
            
           }l++;
           }return l;}}
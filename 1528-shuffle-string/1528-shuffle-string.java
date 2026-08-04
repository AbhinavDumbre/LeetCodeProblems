class Solution {
    public String restoreString(String s, int[] indices) {
        int index=0;
       
        char[] ch=new char[indices.length];
        
        
        for(int i=0;i<indices.length;i++){
            ch[indices[i]]=s.charAt(index);
            index++;
        }
        String str2 = String.valueOf(ch);
     return str2;   
    }
}
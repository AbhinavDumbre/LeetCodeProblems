class Solution {
    public String removeDuplicates(String s) {
        StringBuffer br=new StringBuffer();
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(br.length()>0 && br.charAt(br.length()-1)==ch){
            br.deleteCharAt(br.length()-1);
        }
        else{
            br.append(ch);
        }
        }return br.toString();

    }
}
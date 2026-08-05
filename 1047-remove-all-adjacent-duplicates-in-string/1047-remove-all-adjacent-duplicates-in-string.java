class Solution {
    public String removeDuplicates(String s) {
        StringBuilder br=new StringBuilder();
       
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(br.length()>0 && br.charAt(br.length()-1)==ch){
            br.deleteCharAt(br.length()-1);
        }
        else{
            br.append(ch);
        }
        }return br.toString();

    // HashSet<Character>hs=new HashSet<>();
    // for(char i : s.toCharArray()){
    //     hs.add(i);
    // }
    // return hs.toString();
    }
}
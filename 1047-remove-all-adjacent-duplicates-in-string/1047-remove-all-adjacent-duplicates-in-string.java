class Solution {
    public String removeDuplicates(String s) {
        StringBuilder br=new StringBuilder();
       
        for(int i=0;i<s.length();i++){
        
        if(br.length()>0 && br.charAt(br.length()-1)==s.charAt(i)){
            br.deleteCharAt(br.length()-1);
        }
        else{
            br.append(s.charAt(i));
        }
        }return br.toString();

    // HashSet<Character>hs=new HashSet<>();
    // for(char i : s.toCharArray()){
    //     hs.add(i);
    // }
    // return hs.toString();
    }
}
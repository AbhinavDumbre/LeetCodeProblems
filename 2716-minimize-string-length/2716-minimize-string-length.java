class Solution {
    public int minimizedStringLength(String s) {
    // HashSet <Character>hs=new HashSet<>();
    // for(int i=0;i<s.length();i++){
    //     hs.add(s.charAt(i));
    // }
    // int ans=hs.size();
    // return ans;}
    return (int)s.chars().distinct().count();
    
}}
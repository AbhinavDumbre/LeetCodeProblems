class Solution {
   static boolean comparedFre(int count1[],int count2[]){
    for(int i=0;i<26;i++){
    if(count1[i]!=count2[i]){
        return false;
    }
   }return true;
   }
    public boolean checkInclusion(String s1, String s2) {
       if(s1.length()>s2.length()){
        return false;

       }
       int count1[]=new int[26];
       for(int i=0;i<s1.length();i++){
        char ch=s1.charAt(i);
        int index=ch-'a';

        count1[index]++;

       }

       int i=0;
       int count2[]=new int[26];
       int windowIndex=s1.length();
        for(i=0;i<windowIndex;i++){
            char ch=s2.charAt(i);
            int index=ch-'a';
            count2[index]++;

        }
        if(comparedFre(count1,count2)==true){
            return true;
        }else{
            while(i<s2.length()){
                char ch=s2.charAt(i);
                int index2=ch-'a';
                count2[index2]++;
                int oldindex=i-windowIndex;
                char chr=s2.charAt(oldindex);

                int freqOldIndex=chr-'a';
                count2[freqOldIndex]--;     
                if(comparedFre(count1,count2)==true){
                    return true;
                }i++;
                }
        }
    return false;
    }
} 
class Solution {
    public boolean rotateString(String s, String goal) {
        boolean b=false;
        while(s.length()==goal.length()){
       if(!s.equals(goal)){
            b=false;
       } 
       s=s+s;
       if(s.contains(goal)){
         b= true;
       }
       
    }return b;}
    }

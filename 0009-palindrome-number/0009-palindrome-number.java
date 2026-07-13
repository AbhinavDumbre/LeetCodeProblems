class Solution {
    public boolean isPalindrome(int x) {

        int copy=x;
        int rev=0;
        int rem=0;
        while(copy>0){
            rem=copy%10;
            rev=(rev*10)+rem;
            copy=copy/10;
        }
        if(rev==x){
            return true;
        }else{return false;}
}}
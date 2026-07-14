class Solution {
    public int reverse(int x) {
        long sum=0;

        while(x!=0){
       if(sum<Integer.MIN_VALUE/10 || sum>Integer.MAX_VALUE/10){
            return 0;
        }
            int sample=x%10;
        sum=sum*10+sample;
        x=x/10; 
        
        }
        
    return (int)sum;}
}
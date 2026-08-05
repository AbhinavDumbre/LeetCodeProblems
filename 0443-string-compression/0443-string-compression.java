class Solution {
    public int compress(char[] chars) {
        
        int readcount=0;
        int writecount=0;
        
        while(readcount<chars.length){
             char currentIndex=chars[readcount];
        int count=0;
            while(readcount<chars.length && currentIndex==chars[readcount]){
                readcount++;
                count++;
            }
            chars[writecount]=currentIndex;
            writecount++;

            if(count>1){
                String countstr=String.valueOf(count);
                for(char digit:countstr.toCharArray()){
                chars[writecount]=digit;
                writecount++;
            }}

            {

            }
        }
    return writecount;
        }
    }

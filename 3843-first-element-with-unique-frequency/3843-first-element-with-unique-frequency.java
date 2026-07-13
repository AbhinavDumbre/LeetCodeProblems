class Solution {
    // public int firstUniqueFreq(int[] nums) {
    //     HashMap<Integer,Integer> set=new HashMap<>();
    //     for(int i:nums){
    //         set.put(i,set.getOrDefault(i,0)+1);
    //     }
    //     for(int i:nums){
            
    //         if(set.get(i)>1){
    //             return i;
    //         }

    //     }return -1;
    // }
    public int firstUniqueFreq(int[] nums) {
        // Map 1: Count how many times each number appears (Number -> Frequency)
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i : nums) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        // Map 2: Count how many times each frequency occurs (Frequency -> Frequency Count)
        HashMap<Integer, Integer> freqCounts = new HashMap<>();
        for (int freq : freqMap.values()) {
            freqCounts.put(freq, freqCounts.getOrDefault(freq, 0) + 1);
        }

        // Find the first number in the original array whose frequency occurs exactly once
        for (int i : nums) {
            int currentFreq = freqMap.get(i);
            if (freqCounts.get(currentFreq) == 1) {
                return i;
            }
        }

        return -1;
    }
}
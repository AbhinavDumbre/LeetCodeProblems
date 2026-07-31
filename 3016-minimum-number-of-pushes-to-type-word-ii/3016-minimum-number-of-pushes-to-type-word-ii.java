class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];

        // Count frequency
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Sort frequencies in ascending order
        Arrays.sort(freq);

        int pushes = 0;
        int rank = 0;

        // Traverse from highest frequency
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) break;

            pushes += freq[i] * (rank / 8 + 1);
            rank++;
        }

        return pushes;
    }
}
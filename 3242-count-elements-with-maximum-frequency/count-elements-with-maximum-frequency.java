class Solution {
    public int maxFrequencyElements(int[] nums) {

                Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the maximum frequency
        int maxFreq = 0;
        for (int f : freq.values()) {
            maxFreq = Math.max(maxFreq, f);
        }

        // Step 3: Count total elements having that maximum frequency
        int count = 0;
        for (int f : freq.values()) {
            if (f == maxFreq) {
                count += f; // add full frequency (not just 1)
            }
        }

        return count;

        
    }
}
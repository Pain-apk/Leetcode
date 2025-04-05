public class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minOperations = Integer.MAX_VALUE;
        int currentWhiteCount = 0;

        // Initial window
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                currentWhiteCount++;
            }
        }
        minOperations = currentWhiteCount;

        // Sliding window
        for (int i = k; i < n; i++) {
            if (blocks.charAt(i) == 'W') {
                currentWhiteCount++;
            }
            if (blocks.charAt(i - k) == 'W') {
                currentWhiteCount--;
            }
            minOperations = Math.min(minOperations, currentWhiteCount);
        }

        return minOperations;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String blocks1 = "WBBWWBBWBW";
        int k1 = 7;
        System.out.println("Output for blocks1: " + solution.minimumRecolors(blocks1, k1)); // Output: 3

        String blocks2 = "WBWBBBW";
        int k2 = 2;
        System.out.println("Output for blocks2: " + solution.minimumRecolors(blocks2, k2)); // Output: 0
    }
}
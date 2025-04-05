public class Solution {
    public int maximumCount(int[] nums) {
        int posCount = 0;
        int negCount = 0;

        for (int num : nums) {
            if (num > 0) {
                posCount++;
            } else if (num < 0) {
                negCount++;
            }
        }

        return Math.max(posCount, negCount);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {-2, -1, -1, 1, 2, 3};
        int[] nums2 = {-3, -2, -1, 0, 0, 1, 2};
        int[] nums3 = {5, 20, 66, 1314};

        System.out.println("Output for example 1: " + solution.maximumCount(nums1)); // Output: 3
        System.out.println("Output for example 2: " + solution.maximumCount(nums2)); // Output: 3
        System.out.println("Output for example 3: " + solution.maximumCount(nums3)); // Output: 4
    }
}
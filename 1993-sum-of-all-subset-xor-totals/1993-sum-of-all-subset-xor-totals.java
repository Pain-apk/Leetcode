public class Solution {
    public int subsetXORSum(int[] nums) {
        return subsetXORSumHelper(nums, 0, 0);
    }

    private int subsetXORSumHelper(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            return currentXOR;
        }
        // Include nums[index] in the subset
        int include = subsetXORSumHelper(nums, index + 1, currentXOR ^ nums[index]);
        // Exclude nums[index] from the subset
        int exclude = subsetXORSumHelper(nums, index + 1, currentXOR);
        return include + exclude;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 3};
        int[] nums2 = {5, 1, 6};
        int[] nums3 = {3, 4, 5, 6, 7, 8};

        System.out.println("Output for [1, 3]: " + solution.subsetXORSum(nums1));
        System.out.println("Output for [5, 1, 6]: " + solution.subsetXORSum(nums2));
        System.out.println("Output for [3, 4, 5, 6, 7, 8]: " + solution.subsetXORSum(nums3));
    }
}
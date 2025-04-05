public class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {2, 1, 3, 4};
        int[] nums3 = {1, 2, 3};

        System.out.println("Output for [3, 4, 5, 1, 2]: " + solution.check(nums1)); // Output: true
        System.out.println("Output for [2, 1, 3, 4]: " + solution.check(nums2)); // Output: false
        System.out.println("Output for [1, 2, 3]: " + solution.check(nums3)); // Output: true
    }
}
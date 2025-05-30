public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for next valid element position

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}

class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        int left = 0, right = nums.size() - 1;

        while (left < right) {
            // If left is odd and right is even, swap
            if (nums[left] % 2 > nums[right] % 2) {
                swap(nums[left], nums[right]);
            }

            // Move left if even
            if (nums[left] % 2 == 0) left++;

            // Move right if odd
            if (nums[right] % 2 == 1) right--;
        }

        return nums;
    }
};

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] == nums2[j][0]) {
                result.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                result.add(nums1[i]);
                i++;
            } else {
                result.add(nums2[j]);
                j++;
            }
        }

        while (i < nums1.length) {
            result.add(nums1[i]);
            i++;
        }

        while (j < nums2.length) {
            result.add(nums2[j]);
            j++;
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] nums1_1 = {{1, 2}, {2, 3}, {4, 5}};
        int[][] nums2_1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] result1 = solution.mergeArrays(nums1_1, nums2_1);
        System.out.println("Output for example 1:");
        for (int[] arr : result1) {
            System.out.println("[" + arr[0] + ", " + arr[1] + "]");
        }

        int[][] nums1_2 = {{2, 4}, {3, 6}, {5, 5}};
        int[][] nums2_2 = {{1, 3}, {4, 3}};
        int[][] result2 = solution.mergeArrays(nums1_2, nums2_2);
        System.out.println("Output for example 2:");
        for (int[] arr : result2) {
            System.out.println("[" + arr[0] + ", " + arr[1] + "]");
        }
    }
}
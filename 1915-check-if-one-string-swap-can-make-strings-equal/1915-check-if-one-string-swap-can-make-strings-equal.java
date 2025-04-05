public class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        int n = s1.length();
        int first = -1, second = -1;

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false; // More than 2 differences
                }
            }
        }

        if (second == -1) {
            return false; // Less than 2 differences
        }

        // Check if swapping the differences makes the strings equal
        return s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1_1 = "bank";
        String s2_1 = "kanb";
        System.out.println("Output for example 1: " + solution.areAlmostEqual(s1_1, s2_1)); // Output: true

        String s1_2 = "attack";
        String s2_2 = "defend";
        System.out.println("Output for example 2: " + solution.areAlmostEqual(s1_2, s2_2)); // Output: false

        String s1_3 = "kelb";
        String s2_3 = "kelb";
        System.out.println("Output for example 3: " + solution.areAlmostEqual(s1_3, s2_3)); // Output: true
    }
}
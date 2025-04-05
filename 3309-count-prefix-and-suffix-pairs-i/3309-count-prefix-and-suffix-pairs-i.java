public class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    public boolean isPrefixAndSuffix(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        
        if (len1 > len2) {
            return false;
        }

        return str2.startsWith(str1) && str2.endsWith(str1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] words1 = {"a", "aba", "ababa", "aa"};
        String[] words2 = {"pa", "papa", "ma", "mama"};
        String[] words3 = {"abab", "ab"};

        System.out.println("Output for example 1: " + solution.countPrefixSuffixPairs(words1)); // Output: 4
        System.out.println("Output for example 2: " + solution.countPrefixSuffixPairs(words2)); // Output: 2
        System.out.println("Output for example 3: " + solution.countPrefixSuffixPairs(words3)); // Output: 0
    }
}
public class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String sentence1 = "i love eating burger";
        String searchWord1 = "burg";
        System.out.println("Output for example 1: " + solution.isPrefixOfWord(sentence1, searchWord1)); // Output: 4

        String sentence2 = "this problem is an easy problem";
        String searchWord2 = "pro";
        System.out.println("Output for example 2: " + solution.isPrefixOfWord(sentence2, searchWord2)); // Output: 2

        String sentence3 = "i am tired";
        String searchWord3 = "you";
        System.out.println("Output for example 3: " + solution.isPrefixOfWord(sentence3, searchWord3)); // Output: -1
    }
}
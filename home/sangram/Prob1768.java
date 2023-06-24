package home.sangram;

/**
 * 1768. Merge Strings Alternately
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 * Return the merged string.
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 */
public class Prob1768 {
    public static void main(String[] args) {
        System.out.println(new Prob1768().mergeAlternately("abc", "pqr"));
    }
    public String mergeAlternately(String word1, String word2) {
        StringBuilder newStr = new StringBuilder();
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        for(int i = 0; i < Math.max(w1.length, w2.length); i++) {
            if(i >= w2.length) newStr.append(w1[i]);
            else if(i >= w1.length) newStr.append(w2[i]);
            else newStr.append(w1[i]).append(w2[i]);
        }
        return newStr.toString();
    }
}

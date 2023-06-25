package home.sangram;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 * Example 1:
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 * Example 2:
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * Example 3:
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */

public class Prob151 {
    public static void main(String[] args) {
        System.out.println(new Prob151().reverseWords("the sky is blue"));
    }
    public String reverseWords(String s) {
        String[] str = s.strip().split(" ");
        StringBuilder sb = new StringBuilder();
        int i = 0, j = str.length - 1;
        while( i <= j ) {
            String temp = str[j];
            str[j] = str[i];
            str[i] = temp;
            i++; j--;
        }
        for (int p = 0; p < str.length; p++)
            if (!str[p].isBlank()) {
                if (p != str.length - 1) sb.append(str[p]).append(" ");
                else sb.append(str[p]);
            }
        return sb.toString();
    }
}

package home.sangram;

import java.util.Arrays;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 * Example 1:
 * Input: s = "hello"
 * Output: "holle"
 * Example 2:
 * Input: s = "leetcode"
 * Output: "leotcede"
 */
public class Prob345 {
    public static void main(String[] args) {
        System.out.println(new Prob345().reverseVowels("leetcode"));
    }
    public String reverseVowels(String s) {
        char[] cs = s.toCharArray();
        int i = 0;
        int j = cs.length-1;
        while (i<=j) {
            if (isVovel(cs[i]) && isVovel(cs[j])){
                char temp = cs[j];
                cs[j] = cs[i];
                cs[i] = temp;
                i++; j--;
            } else if (isVovel(cs[i]) && !isVovel(cs[j])) j --;
            else if (!isVovel(cs[i]) && isVovel(cs[j])) i ++;
            else {i++; j--;}
        }
        return String.valueOf(cs);
    }

    public boolean isVovel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c== 'o' || c == 'u'
        ||     c == 'A' || c == 'E' || c == 'I' || c== 'O' || c == 'U';
    }
}

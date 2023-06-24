package home.sangram;

import java.util.*;

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * Example 1:
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * Example 2:
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * Example 3:
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 */
public class Prob1071 {
    public static void main(String[] args) {
        System.out.println(new Prob1071().gcdOfStrings("ABA", "ABCADABCAD"));
    }

    public String gcdOfStrings(String str1, String str2) {
        int len1 =  str1.length(), len2 = str2.length();
        int maxIndex = Math.min(len1, len2);
        for(int i = maxIndex; i >= 1; i--) {
            if(len1 % i == 0 && len2 % i == 0 && str1.substring(0, i).equals(str2.substring(0, i))){
                String s1 = str1.substring(i) + str1.substring(0, i);
                String s2 = str2.substring(i) + str2.substring(0 ,i);
                if (s1.equals(str1) && s2.equals(str2))
                    return str1.substring(0, i);
            }
        }
        return "";
    }
}
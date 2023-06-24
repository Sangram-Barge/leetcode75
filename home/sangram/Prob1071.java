package home.sangram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
//        System.out.println(new Prob1071().gcdOfStrings("ABA", "ABAB"));
        new Prob1071().test("ABCABC", "AB");
    }

    public void test(String str1, String str2) {
        List<String> gcdList = new ArrayList<>();
        char[] str1Arr = str1.toCharArray();
        int index = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (i == 0)  gcdList.add(String.valueOf(str1Arr[i]));
            else if (!gcdList.contains(String.valueOf(str1Arr[i]))) {
                gcdList.add(index, gcdList.get(index - 1) + str1Arr[i]);
            }
            index++;
//            else gcdList.add(String.valueOf(str1Arr[i]));
        }
        System.out.println(gcdList);
    }
    public String gcdOfStrings(String str1, String str2) {
        String gcd = getRep(str2);
        return gcd.equals(getRep(str1)) ? gcd : "";
    }

    public String getRep(String str) {
        StringBuilder gcd = new StringBuilder();
        char[] str2Arr = str.toCharArray();
        Set<Character> charSet = new HashSet<>();
        boolean repFlag = false;
        for(char c : str2Arr){
            boolean isCharPresent = charSet.add(c);
            if(isCharPresent && repFlag) {
                gcd.append(c);
            } else if (isCharPresent) {
                gcd.append(c);
                repFlag = true;
            }
        }
        if ( !(str.length() % gcd.length() == 0) ) {
            gcd.delete(0, gcd.length());
            gcd.append(str);
        }
        return gcd.toString();
    }
}

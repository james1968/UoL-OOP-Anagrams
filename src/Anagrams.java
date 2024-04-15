import java.lang.reflect.Array;
import java.io.*;
import java.util.*;
public class Anagrams {
    public static String anagrams( String a, String b ) {
        ArrayList<Character> diff = new ArrayList<Character>();
        HashMap<Character, Integer> A = alphaFrequency(a);
        HashMap<Character, Integer> B = alphaFrequency(b);

        for (Character ch : A.keySet()) {
            if (!B.containsKey(ch) || B.get(ch) != A.get(ch)) {
                diff.add(ch);
            }
        }

        for (Character ch : B.keySet()) {
            if (!A.containsKey(ch) || A.get(ch) != B.get(ch)) {
                diff.add(ch);
            }
        }
        if (diff.isEmpty()) {
            return "Anagram";
        }
        else {
            char max = diff.get(0);
            for (char ch : diff) {
                if (ch > max) {
                    max = ch;
                }
            }
            return String.valueOf(max);
        }
    }

    public static HashMap<Character, Integer> alphaFrequency(String s) {
        HashMap<Character, Integer> frequencies = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++){
            int count = 0;
            char c = s.charAt(i);
            if (isAlpha(c)) {
                c = Character.toLowerCase(c);
                if (!frequencies.containsKey(c)) {
                    frequencies.put(c, 1);
                } else if (frequencies.containsKey(c)) {
                    frequencies.put(c, frequencies.get(c)+1);
                }
            }
        }
        return frequencies;
    }

    public static boolean isAlpha(char ch) {
        return ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z');
    }
}

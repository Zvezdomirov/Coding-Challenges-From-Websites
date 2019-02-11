package firstNotRepeatingCharacter;

import java.util.*;

public class FirstNotRepeatingCharacter {
    public static void main(String[] args) {
        String input = "abacabaabacaba";
        System.out.println(firstNotRepeatingCharacter(input));
    }

    static char firstNotRepeatingCharacter(String s) {

        int[] letterOccurrences = new int[26];
        for (int i = 0; i < 26; i++) {
            letterOccurrences[i] = -2;
        }
        for (int i = 0; i < s.length(); i++) {
            if (letterOccurrences[s.charAt(i) - 97] >= 0) {
                letterOccurrences[s.charAt(i) - 97] = -1;
            } else if (letterOccurrences[s.charAt(i) - 97] == -2){
                letterOccurrences[s.charAt(i) - 97] = i;
            }
        }

        char nonDupMinChar = '_';
        int currentMinInd = Integer.MAX_VALUE;

        for (int i = 0; i < letterOccurrences.length; i++) {
            if (letterOccurrences[i] >= 0 && letterOccurrences[i] < currentMinInd) {
                nonDupMinChar = (char) (i + 97);
                currentMinInd = letterOccurrences[i];
            }
        }

        return nonDupMinChar;
    }

}

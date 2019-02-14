public class RepeatedString {
    public static void main(String[] args) {
        String str = "aba";
        long repeatingPatternLength = 10;
        System.out.println(repeatedString(str, repeatingPatternLength));
    }
    static long repeatedString(String s, long n) {
        long letterAOccurrence = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                letterAOccurrence++;
            }
        }
        letterAOccurrence *= (n / s.length());
        long lettersLeft = n % s.length();
        for (int i = 0; i < lettersLeft; i++) {
            if (s.charAt(i) == 'a') {
                letterAOccurrence++;
            }
        }
        return letterAOccurrence;
    }
}

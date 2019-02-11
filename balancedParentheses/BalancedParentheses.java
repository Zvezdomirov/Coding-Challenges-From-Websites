package balancedParentheses;

import java.util.NoSuchElementException;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String[] expressions = {"(()]", "{(()[[]])}"};

        for (String answer : areBracketsCorrect(expressions)) {
            System.out.println(answer);
        }
    }

    public static String[] areBracketsCorrect(String[] expressions) {
        String[] result = new String[expressions.length];

        Stack<Character> bracketStack = new Stack<>();

        int resultInd = 0;
        for (String expression : expressions) {
            for (Character bracket : expression.toCharArray()) {
                if (!bracketStack.empty() && bracket == getClosingBracket(bracketStack.peek())) {
                    bracketStack.pop();
                } else {
                    bracketStack.push(bracket);
                }
            }
            if (bracketStack.empty()) {
                result[resultInd++] = "YES";
            } else {
                result[resultInd++] = "NO";
            }
            bracketStack.clear();
        }
        return result;
    }

    public static char getClosingBracket(char bracket) {
        switch (bracket) {
            case '(':
                return ')';
            case '[':
                return ']';
            case '{':
                return '}';
            default:
                throw new NoSuchElementException();
        }
    }
}

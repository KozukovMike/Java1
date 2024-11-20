import java.util.Scanner;
import java.util.Stack;

public class Parentheses {
    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c: input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!match(top, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean match(char open, char close) {
        return  (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}

import java.util.Scanner;
import java.util.Stack;

public class Task_1_3_4 {
    public static class Parentheses {
        public static boolean isBalanced(String input) {
            Stack<Character> stack = new Stack<Character>();
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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для проверки балансировки скобок:");
        String input = scanner.nextLine();

        if (Main.Parentheses.isBalanced(input)) {
            System.out.println("Скобки сбалансированы.");
        } else {
            System.out.println("Скобки не сбалансированы.");
        }
    }
}

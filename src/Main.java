import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для проверки балансировки скобок:");
        String input = scanner.nextLine();

        if (Parentheses.isBalanced(input)) {
            System.out.println("Скобки сбалансированы.");
        } else {
            System.out.println("Скобки не сбалансированы.");
        }
    }
}
package works;
import java.util.Scanner;
import java.util.Stack;
public class task {
    public static void main(String[] args) {
        boolean cycle = true;
            Scanner scanner = new Scanner(System.in);
            Stack<String> stack = new Stack<>();
        while (cycle == true) {
            System.out.println("введите команду или слово для записи: ");
            String input = scanner.nextLine();
            if (input.equals("print")) {
                for(int i = stack.size() - 1; i >= 0; i--) {
                    System.out.print(stack.get(i));
                    if (i > 0) {
                        System.out.print(",");
                    }
                }
                System.out.println();
                }
            else if (input.equals("revert")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    throw new IllegalStateException("NoSuchElementException");
                }
            }
            else if (input.equals("exit")) {
                cycle = false;
            }
            else {
                stack.push(input);
            }
        }
    }
}
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Input:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String result = calc(input);
            System.out.println("Output:");
            System.out.println(result);
        }
    }

    public static String calc(String input) throws IOException {
        char operator = 0;
        int operatorIndex = -1;
        int startIndex = 0;

        for (int i = startIndex; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                operator = c;
                operatorIndex = i;
                break;
            }
        }
        String left = input.substring(0, operatorIndex);
        String right = input.substring(operatorIndex + 1);

        int a = Integer.parseInt(left);
        int b = Integer.parseInt(right);
        int result = 0;

        if (a > 10 || b > 10) {
            throw new IOException();
        }
        if (a == 0 || b == 0) {
            throw new IOException();
        }


        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        return String.valueOf(result);
    }
}
